package ru.vmmelnik.simuduck.ducks;

import ru.vmmelnik.simuduck.behaviors.FlyWithWings;
import ru.vmmelnik.simuduck.behaviors.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm MallardDuck");
	}

}
