package com.universally2.springbootTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.universally2.springbootTest.pojo.Dog;
import com.universally2.springbootTest.pojo.Person;

@SpringBootTest
class SpringbootTestApplicationTests {
	
	@Autowired
	private Dog dog;
	
	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		
		System.out.println(dog);
		System.out.println(person);
	}

}
