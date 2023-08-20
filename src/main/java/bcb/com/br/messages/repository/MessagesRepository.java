package bcb.com.br.messages.repository;

import bcb.com.br.messages.domain.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, String> {
}
