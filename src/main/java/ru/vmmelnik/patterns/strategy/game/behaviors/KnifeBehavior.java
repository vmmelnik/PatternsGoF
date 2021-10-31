package ru.vmmelnik.patterns.strategy.game.behaviors;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Use knife!");
	}
}
