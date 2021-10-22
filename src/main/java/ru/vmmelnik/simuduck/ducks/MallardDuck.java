package ru.vmmelnik.simuduck.ducks;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.printf("I'm %s", getClass().getSimpleName());
	}

}
