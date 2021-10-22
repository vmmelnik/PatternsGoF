package ru.vmmelnik.simuduck.ducks;

/**
 * @author vmmelnik
 * @version 0.1
 * Abstract superclass Duck
 */
public abstract class Duck {

	public void quack() {
		System.out.println("Quack!");
	}

	public void swim() {
		System.out.println("Duck swimming");
	}

	public abstract void display();

}
