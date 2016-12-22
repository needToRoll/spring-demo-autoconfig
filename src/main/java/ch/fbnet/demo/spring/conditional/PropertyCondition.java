package ch.fbnet.demo.spring.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by dev on 22.12.16.
 */
@Component
public class PropertyCondition {

    @Bean
    @ConditionalOnProperty(prefix = "training",name = "enabled",havingValue = "true", matchIfMissing = false)
    public void printMatch(){
        System.out.println("property matches");
    }

    @Bean
    @ConditionalOnProperty(prefix = "training",name = "enabled",havingValue = "false", matchIfMissing = true)
    public void printNoMatch(){
        System.out.print("property does not match");
    }
}
