package com.tnsif.oopsconcept;

public class PolymorphismDemo {
	

		public static void main(String[] args) {
			
			
			MathOp mo = new MathOp();
			System.out.println(mo.add(20.00, 40.00));
			System.out.println(mo.add(20, 50));
			
			
//			AnimalDemo ad = new AnimalDemo();
//			ad.sound();
			Cat c = new Cat();
			c.sound();
			
			
			

		}

	}



