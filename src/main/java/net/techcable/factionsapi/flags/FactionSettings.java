package net.techcable.factionsapi.flags;

/**
 * Represents a faction's settings
 * <p>
 * Most implementations don't support custom settings
 * If they do you can create
 * </p>
 */
public interface FactionSettings {

    /**
     * Returns if the faction is open
     * <p>
     * Open factions allow anyone to join
     * Closed factions can only be joined by invitation
     * </p>
     *
     * @return the open flag
     */
    public boolean isOpen();

    /**
     * Return whether monsters can spawn in the faction's territory
     *
     * @return whether monsters can spawn in the faction's territory
     */
    public boolean canMonstersSpawn();

    /**
     * Return whether players can pvp in the faction's territory
     *
     * @return whether players can pvp in the faction's territory
     */
    public boolean isPvpAllowed();

    /**
     * Returns if this faction's power is lowered when someone in it dies
     * <p>
     * Defaults to true
     * </p>
     *
     * @return if this faction's power is lowered when a member dies
     */
    public boolean isLoosePowerOnDeath();

    /**
     * Returns if friendly players are allowed to attack each other in this faction's territory
     *
     * <p>
     * 'Friendly' Players includes {@link net.techcable.factionsapi.Relation#TRUCE} {@link net.techcable.factionsapi.Relation#ALLY}
     * and {@link net.techcable.factionsapi.Relation#SAME}
     * </p>
     *
     * @return if friendly players are allowed to attack each other
     */
    public boolean isFriendlyFireAllowed(); //NOTE: is warZoneFriendlyFire in faction uuid

    /**
     * Returns if explosions can happen at all in the territory
     *
     * <p>
     * Unlike {@link #isOfflineExplosions()} this setting blocks explosions even if players are online
     * </p>
     *
     * @return
     */
    public boolean isExplosionsAllowed();

    /**
     * Returns if explosions are allowed when a faction is offline
     *
     * <p>
     * A faction is considdered offline if {@link net.techcable.factionsapi.IFaction#isOffline()} returns true
     * </p>
     *
     * @return if explosions are allowed when the faction is offline
     */
    public boolean isOfflineExplosions();

    /**
     * Returns if endermen are allowed to pick up blocks in the faction's territory
     *
     * @return if endermen are allowed to move blocks in the faction's territory
     */
    public boolean isEndermanGrief();

    /**
     * Returns if the faction is permanent
     *
     * <p>
     * Permanent factions can't be disbanded
     * </p>
     *
     * @return if the faction is permanent
     */
    public boolean isPermanent();

    /**
     * Returns if the faction is peaceful
     *
     * <p>
     * Peaceful factions are at truce with everyone
     * Peaceful factions typicaly have {@link #isExplosionsAllowed()} set to false
     * </p>
     *
     * @return if the faction is peaceful
     */
    public boolean isPeaceful();

    /**
     * Returns if the faction has infinite power
     *
     * <p>
     * If a faction has infinite power, they can claim infinite land
     * </p>
     *
     * @return
     */
    public boolean hasInfinitePower();
}
