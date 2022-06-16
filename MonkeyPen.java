package com.InterfaceAbstractionexamples;

public class MonkeyPen {

	public static void main(String[] args) {

		System.out.println("---Pen----");
		FountainPen fountainpen = new FountainPen();
		fountainpen.changeNib();
		fountainpen.refil();
		fountainpen.write();
		System.out.println();

		System.out.println("---Money---");
		Monkey oMonkey = new Monkey();
		oMonkey.bite();
		oMonkey.jump();
		System.out.println();

		System.out.println("---Human---");
		Man human = new Man();
		human.speak();

		Human b = new Man();
		b.eat();
		b.sleep();

	}

}
