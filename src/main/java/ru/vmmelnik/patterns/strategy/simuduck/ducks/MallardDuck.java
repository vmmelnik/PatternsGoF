package ru.vmmelnik.patterns.strategy.simuduck.ducks;

import ru.vmmelnik.patterns.strategy.simuduck.behaviors.FlyWithWings;
import ru.vmmelnik.patterns.strategy.simuduck.behaviors.Quack;

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
