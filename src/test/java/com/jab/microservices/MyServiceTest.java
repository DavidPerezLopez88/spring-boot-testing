package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyServiceTest {
	
	@InjectMocks
	private MyService myService;
	
	
	@Test
	public void greet() {
		String strResponse = myService.greet();
		
		assertEquals("Hello, World", strResponse);
	}

}
