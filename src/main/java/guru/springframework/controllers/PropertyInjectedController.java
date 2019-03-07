package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired  //autowired called by type (hard type) (not interface) so no need to @Qualify
    public GreetingServiceImpl greetingService;

    // Case 2. -  put the name of the property as the Bean name but use interface
    // Spring will reflect that the property name matches Bean name
    public GreetingService greetingServiceImp;

    public String sayHello(){
        return greetingService.sayGreetings();
        // Case 2. - use proper property name, also thange should be done in test PropertyInjectedControllerTest
        //return greetingServiceImp.sayGreetings();
    }
}
