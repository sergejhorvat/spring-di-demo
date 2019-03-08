package guru.springframework.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary  // If there is more than one Bean use this one
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    @Qualifier("greetingServiceImpl")
    public String sayGreetings() {
        return "Hello - primary Greeting service";
    }
}
