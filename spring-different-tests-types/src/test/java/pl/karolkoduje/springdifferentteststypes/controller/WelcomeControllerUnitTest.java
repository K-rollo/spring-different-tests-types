package pl.karolkoduje.springdifferentteststypes.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.karolkoduje.springdifferentteststypes.service.WelcomeService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WelcomeControllerUnitTest {

    @Test
    void shouldWelcome() {

        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        when(welcomeService.getWelcomeMessage("John"))
                .thenReturn("Welcome John!");

        WelcomeController welcomeController = new WelcomeController(welcomeService);

        assertEquals("Welcome John!",welcomeController.welcome("John"));
    }
}