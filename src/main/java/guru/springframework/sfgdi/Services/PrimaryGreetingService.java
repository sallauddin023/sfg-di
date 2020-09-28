package guru.springframework.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {

        return "Hello World --From Primary Bean";
    }
}
