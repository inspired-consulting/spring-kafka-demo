package inspired.springkafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    private final KafkaTemplate<Object, SimpleMessage> template;

    public MessageController(KafkaTemplate<Object, SimpleMessage> template) {
        this.template = template;
    }

    @PostMapping(path = "/send/{msg}")
    public String sendFoo(@PathVariable String msg) {
        this.template.send("spring-topic", new SimpleMessage(msg));
        return "OK";
    }

}
