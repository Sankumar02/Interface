package com.InterfaceAbstractionexamples;
/*
 * Create a class monkey with jump ( ) and bite ( ) methods Create a class Man which inherits 
 * this monkey class and implements Human interface with eat ( ) and sleep methods 

 */
public class Monkey {
	public void jump() {
		System.out.println("Monkey can Jump tree to tree");
	}

	public void bite() {
		System.out.println("Money will Bite and it leads to poison");
	}
}

interface Human {

	public void eat();

	public void sleep();

}

class Man extends Monkey implements Human {
	void speak() {
		System.out.println("Speaking....");
	}

	@Override
	public void eat() {
		System.out.println("Eating");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");

	}

}
