package ru.vmmelnik.simuduck.ducks;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm DecoyDuck");
	}

	@Override
	public void quack() {
		System.out.println("DecoyDuck cannot quack");
	}

	@Override
	public void fly() {
		System.out.println("DecoyDuck cannot fly");
	}

}
