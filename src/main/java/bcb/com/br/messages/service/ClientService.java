package bcb.com.br.messages.service;

import bcb.com.br.messages.clients.ClientsClient;
import bcb.com.br.messages.clients.dto.ClientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientsClient client;

    public ClientResponse getClientInfo(String cnpj) {
        //todo realizar tratamento apropriado para quando o cliente não for encontrado. atualmente 500.
        return client.getClient(cnpj).getBody();
    }
}
