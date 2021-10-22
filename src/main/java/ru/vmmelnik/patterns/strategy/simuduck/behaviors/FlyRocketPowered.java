package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I’m flying with a rocket!");
	}
}
