package guru.springframework.services;

public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings(){
        return "Hello - I was injected by the getter!!!";
    }
}
