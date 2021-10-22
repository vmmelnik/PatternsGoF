package ru.vmmelnik.simuduck.ducks;

/**
 * @author vmmelnik
 * @version 0.2
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

	public void fly() {
		System.out.printf("%s flying", getClass().getSimpleName());
	}

}
