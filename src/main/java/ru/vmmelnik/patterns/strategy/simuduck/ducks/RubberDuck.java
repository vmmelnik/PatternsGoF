package ru.vmmelnik.patterns.strategy.simuduck.ducks;

import ru.vmmelnik.patterns.strategy.simuduck.behaviors.FlyNoWay;
import ru.vmmelnik.patterns.strategy.simuduck.behaviors.MuteQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm RubberDuck");
	}

}
