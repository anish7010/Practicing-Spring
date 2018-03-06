package com.example.demo;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)factory.getBean("triangle");
		t.display();
		
		List<Integer> x = t.getNumbers();
		for(Integer i : x)
		  System.out.println(i);
	}

}  
