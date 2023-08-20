package bcb.com.br.messages.service;

import bcb.com.br.messages.clients.dto.ClientResponse;
import bcb.com.br.messages.controller.dto.SendMessageRequest;
import bcb.com.br.messages.domain.entity.Messages;
import bcb.com.br.messages.domain.enums.Status;
import bcb.com.br.messages.repository.MessagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagesService {

    private final ClientService clientService;
    private final MessagesRepository messagesRepository;



    public void sendMessage(SendMessageRequest request) {
        clientService.getClientInfo(request.getCnpj());
        Messages messages = createNewMessage(request);
        messagesRepository.save(messages);

    }

    private Messages createNewMessage(SendMessageRequest request) {
        return new Messages(null, request.getCnpj(), request.getMessage(), request.getTelephoneDestiny(), request.getIsWhatsApp(), Status.PROCESSING);
    }
}
