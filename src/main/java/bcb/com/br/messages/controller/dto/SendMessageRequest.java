package bcb.com.br.messages.controller.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

@Data
public class SendMessageRequest {
    @CNPJ
    @NotBlank
    @Max(14)
    @Size(min = 14, max = 14)
    private String cnpj;
    @NotBlank
    private String message;
    @NotBlank
    private String telephoneDestiny;
    @NotBlank
    private Boolean isWhatsApp;

}
