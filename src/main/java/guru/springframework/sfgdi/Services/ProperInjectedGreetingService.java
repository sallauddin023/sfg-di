package guru.springframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ProperInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {

        return "Hello World --Property";
    }
}
