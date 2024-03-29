package bcb.com.br.messages.service;

import bcb.com.br.messages.controller.dto.MessageProvisionRequest;
import bcb.com.br.messages.controller.dto.SendMessageRequest;
import bcb.com.br.messages.domain.entity.Message;
import bcb.com.br.messages.domain.enums.Status;
import bcb.com.br.messages.repository.MessageRepository;
import bcb.com.br.messages.service.dto.StatusMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final ClientService clientService;
    private final MessageRepository messageRepository;
    private final MessageSendService sendService;

    @Value("${service.channel-name}")
    private String channel;

    public void sendMessage(SendMessageRequest request) {
        clientService.getClientInfo(request.getCnpj());
        Message message = createNewMessage(request);
        messageRepository.save(message);
        MessageProvisionRequest messageRequest = createMessageProvision(message);
        sendService.sendProvisionToQueue(messageRequest);
    }

    private MessageProvisionRequest createMessageProvision(Message message) {
        return new MessageProvisionRequest(message.getCnpj(), channel, message.getId().toString());
    }

    private Message createNewMessage(SendMessageRequest request) {
        return new Message(null, request.getCnpj(), request.getMessage(), request.getTelephoneDestiny(), request.getIsWhatsApp(), Status.PROCESSING, Timestamp.from(Instant.now()));
    }

    public void attMessage(StatusMessage statusMessage) {
        Message message = messageRepository.findById(statusMessage.getId()).get();
        message.setStatus(statusMessage.getStatus());
        messageRepository.save(message);
    }
}
