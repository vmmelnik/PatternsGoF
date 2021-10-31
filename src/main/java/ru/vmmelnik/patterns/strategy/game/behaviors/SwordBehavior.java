package ru.vmmelnik.patterns.strategy.game.behaviors;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Use sword!");
	}

}
