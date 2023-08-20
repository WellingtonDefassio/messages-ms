package bcb.com.br.messages.clients;

import bcb.com.br.messages.clients.dto.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ClientsClient", url = "${clients.client-ms}")
public interface ClientsClient {

    @GetMapping("/v1/clients")
    ResponseEntity<ClientResponse> getClient(@RequestParam String cnpj);

}
