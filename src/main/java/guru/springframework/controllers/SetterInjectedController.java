package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    @Autowired // works with out it it wires it with a constructor
    public SetterInjectedController(@Qualifier("getterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

