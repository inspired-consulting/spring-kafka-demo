package inspired.springkafkademo;

import inspired.springkafkademo.messages.ComplexMessage;
import inspired.springkafkademo.messages.Message;
import inspired.springkafkademo.messages.SimpleMessage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageReceiver {

    private final KafkaTemplate<Object, Message> template;

    public MessageReceiver(KafkaTemplate<Object, Message> template) {
        this.template = template;
    }

    @PostMapping(path = "/receive/simple/{msg}")
    public String sendFoo(@PathVariable String msg) {
        this.template.send("spring-topic", new SimpleMessage(msg));
        return "OK";
    }

    @PostMapping(path = "/receive/complex", consumes = "application/json")
    public ResponseEntity<String> sendFoo(@RequestBody ComplexMessage msg) {
        //this.template.send("spring-topic", msg);
        System.out.println(msg);
        return ResponseEntity.ok("OK");
    }

}
