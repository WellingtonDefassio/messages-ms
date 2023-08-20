package bcb.com.br.messages.clients.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ClientResponse {
    private UUID id;

    private String name;

    private String email;

    private String telephone;

    private String cpf;

    private String cnpj;

    private String companyName;

}
