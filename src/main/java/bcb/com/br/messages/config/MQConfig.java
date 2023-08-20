package bcb.com.br.messages.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MQConfig {

    @Value("${rabbit.queue.entries}")
    private String queueName;

    @Bean
    public Queue sendProvisionQueue() {
        return new Queue(queueName, true);
    }

}
