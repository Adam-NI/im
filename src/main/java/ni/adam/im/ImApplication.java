package ni.adam.im;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello IM World";
    }

    public static void main(String[] args) {
        SpringApplication.run(ImApplication.class, args);
    }
}
