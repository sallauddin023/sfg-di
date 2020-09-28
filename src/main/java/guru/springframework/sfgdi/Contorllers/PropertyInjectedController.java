package guru.springframework.sfgdi.Contorllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("properInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayGreetings();

    }
}
