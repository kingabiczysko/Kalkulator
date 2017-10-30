package com.kodilla.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(CalculatorApplication.class, args);


		Calculator calculator1 = new Calculator(1,2);

		calculator1.addAToB();

		System.out.println("Result for adding number: " + calculator1.a + " and number: "+ calculator1.b + " is: " + calculator1.result);

		calculator1.aMinusB();

		System.out.println("Result for subtraction number: " + calculator1.a + " from number: "+ calculator1.b + " is: " + calculator1.result);


	}
}
