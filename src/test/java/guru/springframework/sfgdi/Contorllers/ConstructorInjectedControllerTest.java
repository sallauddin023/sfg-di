package guru.springframework.sfgdi.Contorllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());


    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}