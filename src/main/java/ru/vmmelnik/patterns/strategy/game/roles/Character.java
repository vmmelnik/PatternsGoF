package ru.vmmelnik.patterns.strategy.game.roles;

import ru.vmmelnik.patterns.strategy.game.behaviors.WeaponBehavior;

public abstract class Character {

	WeaponBehavior weapon;

	abstract void fight();

	void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}

}
