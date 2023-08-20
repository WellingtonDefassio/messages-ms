package bcb.com.br.messages.service;

import bcb.com.br.messages.clients.ClientsClient;
import bcb.com.br.messages.clients.dto.ClientResponse;
import bcb.com.br.messages.exception.ClientRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientsClient client;

    public ClientResponse getClientInfo(String cnpj) {
        ResponseEntity<ClientResponse> clientRes = client.getClient(cnpj);
        if(clientRes.getStatusCode().is2xxSuccessful()) {
            return clientRes.getBody();
        }
        throw new ClientRequestException();
    }
}
