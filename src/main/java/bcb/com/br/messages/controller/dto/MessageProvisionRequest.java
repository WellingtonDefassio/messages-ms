package bcb.com.br.messages.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MessageProvisionRequest {
    @NotEmpty
    private String cnpj;
    private String channel;
    private String id;
}
