package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck cannot fly");
	}

}
