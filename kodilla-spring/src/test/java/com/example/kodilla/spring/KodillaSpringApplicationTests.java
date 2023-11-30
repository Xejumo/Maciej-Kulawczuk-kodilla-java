package com.example.kodilla.spring;

import com.example.kodilla.spring.shape.Circle;
import com.example.kodilla.spring.shape.Shape;
import com.example.kodilla.spring.shape.Square;
import com.example.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.kodilla.spring");
		Shape shape = context.getBean(Circle.class);

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a circle.", name);
	}

	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.kodilla.spring");
		Shape shape = context.getBean(Triangle.class);

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a triangle.", name);
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.kodilla.spring");
		Shape shape = context.getBean(Square.class);

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a square.", name);
	}

	@Test
	void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.example.kodilla.spring");
		Shape shape = (Shape)context.getBean("chosenShape");

		//When
		String name = shape.getShapeName();

		//Then
		System.out.println("Chosen shape says: " + name);
	}
}

