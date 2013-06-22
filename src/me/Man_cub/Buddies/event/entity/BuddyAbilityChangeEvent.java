package me.Man_cub.Buddies.event.entity;

import me.Man_cub.Buddies.component.entity.living.buddy.Buddy;

import org.spout.api.event.Cancellable;
import org.spout.api.event.HandlerList;
import org.spout.api.event.entity.EntityEvent;

public class BuddyAbilityChangeEvent extends EntityEvent implements Cancellable {
	private static HandlerList handlers = new HandlerList();
	private final byte flyingSpeed;
	private final byte walkingSpeed;
	private final boolean isFlying;
	private final boolean canFly;

	public BuddyAbilityChangeEvent(Buddy buddy) {
		super(buddy.getOwner());
		flyingSpeed = buddy.getFlyingSpeed();
		walkingSpeed = buddy.getWalkingSpeed();
		isFlying = buddy.isFlying();
		canFly = buddy.canFly();
	}

	public byte getFlyingSpeed() {
		return flyingSpeed;
	}

	public byte getWalkingSpeed() {
		return walkingSpeed;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public boolean canFly() {
		return canFly;
	}


	@Override
	public void setCancelled(boolean cancelled) {
		super.setCancelled(cancelled);
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}