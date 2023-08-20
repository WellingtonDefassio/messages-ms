package bcb.com.br.messages.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity(name = "entries")
@Data
public class Entries {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long clientId;
    private Double balanceRate;
    private String balanceType;
    private String entriesType;
    private Double amount;
    private String channel;
    private String channelId;
    private Timestamp createdAt;

}
