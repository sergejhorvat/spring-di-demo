package guru.springframework.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary  // If there is more than one Bean use this one
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello - primary Greeting service";
    }
}
