package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
