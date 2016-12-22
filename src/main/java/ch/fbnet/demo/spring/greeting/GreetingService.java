package ch.fbnet.demo.spring.greeting;

import org.springframework.stereotype.Component;

/**
 * Created by dev on 22.12.16.
 */
@Component
public class GreetingService {
    public String sayHello(){
        return "Hello SpringBoot";
    }

    public GreetingService() {
    }
}
