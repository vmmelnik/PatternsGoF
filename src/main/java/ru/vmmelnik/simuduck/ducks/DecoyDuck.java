package ru.vmmelnik.simuduck.ducks;

import ru.vmmelnik.simuduck.behaviors.FlyNoWay;
import ru.vmmelnik.simuduck.behaviors.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm DecoyDuck");
	}

}
