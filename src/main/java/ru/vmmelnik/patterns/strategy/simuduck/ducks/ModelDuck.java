package ru.vmmelnik.patterns.strategy.simuduck.ducks;

import ru.vmmelnik.patterns.strategy.simuduck.behaviors.FlyNoWay;
import ru.vmmelnik.patterns.strategy.simuduck.behaviors.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I’m a model duck");
	}

}
