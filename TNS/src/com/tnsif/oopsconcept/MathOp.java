package com.tnsif.oopsconcept;

public class MathOp {
	
		//Method Overloading
		int add(int a, int b) {
			return a + b;
		}
		
		double add(double a, double b) {
			return a + b;
		}
	}

	//Method Overriding

	class AnimalDemo{
		
		void sound() {
			System.out.println("Animal can make a sound");
		}
	}

	class Cat extends AnimalDemo{
		
		void sound() {
			System.out.println("Cat makes a sound Meowwww!!!");
		}
	}


	


