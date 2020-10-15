package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {

	@InjectMocks
	private MyController myController;
	
	@Test
	public void blabla() {
		String strResponse = myController.greeting();
		
		assertEquals("Hello, World", strResponse);
	}
}
