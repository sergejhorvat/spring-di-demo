package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service  // need to be annotated so spring context is wired up
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURUS = "Hello gurus!!! from GreetingServiceImpl";

    @Override
    public String sayGreetings(){
        return HELLO_GURUS;
    }
}
