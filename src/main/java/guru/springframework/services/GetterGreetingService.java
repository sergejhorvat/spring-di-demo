package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings(){
        return "Hello - I was injected by the getter!!!";
    }

}
