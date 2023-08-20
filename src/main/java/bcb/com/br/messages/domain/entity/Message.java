package bcb.com.br.messages.domain.entity;

import bcb.com.br.messages.domain.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity(name = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private String cnpj;
    @NotBlank
    private String message;
    @NotBlank
    private String telephoneDestiny;
    @NotNull
    private Boolean isWhatsApp;
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Timestamp createdAt;


}
