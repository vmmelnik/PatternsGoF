package ru.vmmelnik.simuduck.ducks;

import ru.vmmelnik.simuduck.behaviors.FlyBehavior;
import ru.vmmelnik.simuduck.behaviors.QuackBehavior;

/**
 * @author vmmelnik
 * @version 0.3
 * Abstract superclass Duck
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performQuack() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("Duck swimming");
	}

	public abstract void display();

	public void performFly() {
		quackBehavior.quack();
	}

	public void doAll() {
		display();
		performQuack();
		performFly();
		swim();
	}

}
