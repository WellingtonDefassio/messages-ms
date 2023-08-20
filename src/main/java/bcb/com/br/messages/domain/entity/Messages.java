package bcb.com.br.messages.domain.entity;

import bcb.com.br.messages.domain.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.UUID;

@Entity(name = "messages")
@Data
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotEmpty
    private String clientId;
    @NotEmpty
    private String message;
    @NotEmpty
    private String telephoneDestiny;
    @NotEmpty
    private Boolean isWhatsApp;
    @Enumerated(EnumType.STRING)
    private Status status;


}
