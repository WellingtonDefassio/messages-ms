package bcb.com.br.messages.controller;

import bcb.com.br.messages.controller.dto.SendMessageRequest;
import bcb.com.br.messages.service.MessagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/messages")
@RequiredArgsConstructor
public class MessagesController {

    private final MessagesService messagesService;

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestBody SendMessageRequest request) {
        messagesService.sendMessage(request);
        return null;
    }

}
