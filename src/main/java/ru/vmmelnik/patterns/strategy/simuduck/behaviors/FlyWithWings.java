package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck flying");
	}

}
