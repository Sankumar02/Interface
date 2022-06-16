package com.InterfaceAbstractionexamples;
/*
 * Create an abstract class pen with methods write () and refill () as abstract methods
 * Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

 */
public abstract class Pen {
	public abstract void write();

	public abstract void refil();
}

class FountainPen extends Pen {

	@Override
	public void write() {
		System.out.println("Start Writing and Rock!!");

	}

	@Override
	public void refil() {
		// TODO Auto-generated method stub
		System.out.println("Then Refill the Pen");

	}

	public void changeNib() {
		System.out.println("First Change the Nib");
	}

}
