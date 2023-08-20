package bcb.com.br.messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MessagesMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagesMsApplication.class, args);
    }

}
