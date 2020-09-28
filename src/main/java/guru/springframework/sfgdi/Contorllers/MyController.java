package guru.springframework.sfgdi.Contorllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {


        return greetingService.sayGreetings();
    }

}
