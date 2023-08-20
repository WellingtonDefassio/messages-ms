package bcb.com.br.messages.domain.entity;

import bcb.com.br.messages.domain.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity(name = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotEmpty
    private String cnpj;
    @NotEmpty
    private String message;
    @NotEmpty
    private String telephoneDestiny;
    @NotEmpty
    private Boolean isWhatsApp;
    @Enumerated(EnumType.STRING)
    private Status status;


}
