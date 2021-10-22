package ru.vmmelnik.patterns.strategy.simuduck.behaviors;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
