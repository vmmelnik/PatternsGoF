package ru.vmmelnik.simuduck.ducks;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm RubberDuck");
	}

	@Override
	public void fly() {
		System.out.println("RubberDuck can't fly");
	}
}