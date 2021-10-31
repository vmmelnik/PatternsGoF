package ru.vmmelnik.patterns.strategy.game.behaviors;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Use axe!");
	}
}
