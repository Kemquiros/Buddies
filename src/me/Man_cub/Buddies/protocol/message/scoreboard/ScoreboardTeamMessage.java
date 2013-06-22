package me.Man_cub.Buddies.protocol.message.scoreboard;

import me.Man_cub.Buddies.protocol.message.BuddiesMainChannelMessage;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.spout.api.util.SpoutToStringStyle;

public class ScoreboardTeamMessage extends BuddiesMainChannelMessage {
	public static final byte ACTION_CREATE = 0;
	public static final byte ACTION_REMOVE = 1;
	public static final byte ACTION_UPDATE = 2;
	public static final byte ADD_PLAYERS = 3;
	public static final byte REMOVE_PLAYERS = 4;
	private final String name, displayName, prefix, suffix;
	private final boolean friendlyFire;
	private final byte action;
	private final String[] players;

	public ScoreboardTeamMessage(String name, byte action, String displayName, String prefix, String suffix, boolean friendlyFire, String[] players) {
		this.name = name;
		this.action = action;
		this.displayName = displayName;
		this.prefix = prefix;
		this.suffix = suffix;
		this.friendlyFire = friendlyFire;
		this.players = players;
	}

	@Override
	public boolean isAsync() {
		return true;
	}

	public String getName() {
		return name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public boolean isFriendlyFire() {
		return friendlyFire;
	}

	public byte getAction() {
		return action;
	}

	public String[] getPlayers() {
		return players;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ScoreboardTeamMessage other = (ScoreboardTeamMessage) obj;
		return new org.apache.commons.lang3.builder.EqualsBuilder()
				.append(this.name, other.name)
				.append(this.action, other.action)
				.append(this.displayName, other.displayName)
				.append(this.prefix, other.prefix)
				.append(this.suffix, other.suffix)
				.append(this.friendlyFire, other.friendlyFire)
				.append(this.players, other.players)
				.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, SpoutToStringStyle.INSTANCE)
				.append("name", name)
				.append("action", action)
				.append("displayName", displayName)
				.append("prefix", prefix)
				.append("suffix", suffix)
				.append("friendlyFire", friendlyFire)
				.append("players", players)
				.toString();
	}

}
