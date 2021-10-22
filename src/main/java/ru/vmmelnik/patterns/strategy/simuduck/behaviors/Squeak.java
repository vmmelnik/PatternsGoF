package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
