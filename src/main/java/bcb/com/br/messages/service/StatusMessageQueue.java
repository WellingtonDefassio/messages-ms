package bcb.com.br.messages.service;

import bcb.com.br.messages.service.dto.StatusMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class StatusMessageQueue {

  private final MessageService messageService;

    @RabbitListener(id = "status", queues = "${spring.rabbit.queue.status}")
    public void attStatusMessage(@Payload String payload) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        StatusMessage statusMessage = mapper.readValue(payload, StatusMessage.class);
        messageService.attMessage(statusMessage);
    }

}
