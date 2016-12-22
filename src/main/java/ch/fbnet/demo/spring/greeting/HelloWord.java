package ch.fbnet.demo.spring.greeting;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by dev on 22.12.16.
 */
@Component
public class HelloWord {



    @PostConstruct
    public void startUp(){
        System.out.println("App started");
    }

    /**
     * Created by dev on 22.12.16.
     */
    public static class InitialGreetingCondition implements Condition
    {
        @Override
        public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
            return false;
        }
    }
}
