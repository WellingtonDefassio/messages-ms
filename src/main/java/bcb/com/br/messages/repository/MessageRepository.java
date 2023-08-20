package bcb.com.br.messages.repository;

import bcb.com.br.messages.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
}
