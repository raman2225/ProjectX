package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.raman.projectx.controller.HomeController;

public class HomeControllerTest {

	@Test
    public void testHomeController() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Welcome to ProjectX");
    }
	
}
