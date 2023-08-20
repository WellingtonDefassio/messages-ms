package bcb.com.br.messages.service;

import bcb.com.br.messages.controller.dto.MessageProvisionRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageSendService {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    public void sendProvisionToQueue(MessageProvisionRequest request) {
        String json = convertToJson(request);
        rabbitTemplate.convertAndSend(queue.getName(), json);
    }

    @SneakyThrows
    private String convertToJson(MessageProvisionRequest request) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(request);
    }

}
