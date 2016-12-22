package ch.fbnet.demo.spring.greeting;

import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by dev on 22.12.16.
 *
 **/

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Inject
    private GreetingService greetingService;

    @GetMapping("/hello")
    public String sayHello(){
        return new GreetingService().sayHello();
    }


}
