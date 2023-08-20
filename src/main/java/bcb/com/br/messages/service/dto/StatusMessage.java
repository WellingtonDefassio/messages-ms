package bcb.com.br.messages.service.dto;

import bcb.com.br.messages.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusMessage {

    private Status status;
    private UUID id;

}
