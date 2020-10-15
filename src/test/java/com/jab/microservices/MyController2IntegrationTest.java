package com.jab.microservices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyController2IntegrationTest {
	
	private static final String OK = "OK";

	@Mock
	private MyService service;
	
	@InjectMocks
	private MyController2 myController2;
	
	@BeforeEach
	public void setUp() {
		Mockito.when(service.greet()).thenReturn(OK);
	}
	
	@Test
	public void greeting() {
		String strMock = myController2.greeting();
		
		verify(service, times(1)).greet();
		assertEquals(OK, strMock);
	}
}
