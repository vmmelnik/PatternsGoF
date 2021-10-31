package ru.vmmelnik.patterns.strategy.game.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Use bow and arrow!");
	}
}
