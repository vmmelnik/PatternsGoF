package ru.vmmelnik.simuduck.ducks;

import ru.vmmelnik.simuduck.behaviors.FlyWithWings;
import ru.vmmelnik.simuduck.behaviors.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm RedheadDuck");
	}
}
