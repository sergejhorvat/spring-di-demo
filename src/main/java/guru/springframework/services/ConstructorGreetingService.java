package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreetings(){
        return " Hello - I was injected via a constructor!!!";
    }
}
