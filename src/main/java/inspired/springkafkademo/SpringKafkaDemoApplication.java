package inspired.springkafkademo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringKafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaDemoApplication.class, args);
	}

	@Bean
	public NewTopic topic() {
		return new NewTopic("spring-topic", 1, (short) 1);
	}

}
