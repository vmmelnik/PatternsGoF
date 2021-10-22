package ru.vmmelnik.patterns.strategy.simuduck.ducks;

import ru.vmmelnik.patterns.strategy.simuduck.behaviors.FlyBehavior;
import ru.vmmelnik.patterns.strategy.simuduck.behaviors.QuackBehavior;

/**
 * @author vmmelnik
 * @version 0.3
 * Abstract superclass Duck
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void doAll() {
		display();
		performQuack();
		performFly();
		swim();
	}

}
