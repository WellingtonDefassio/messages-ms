package bcb.com.br.messages.repository;

import bcb.com.br.messages.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String> {
}
