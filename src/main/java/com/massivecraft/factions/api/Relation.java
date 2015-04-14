package com.massivecraft.factions.api;

/**
 * The relation between two {@link com.massivecraft.factions.api.IFaction}
 * <p>
 * Players can't technically have a relation to another player,
 * but it is usually represented as the relation between the factions the players are in.   
 * </p>
 */
public enum Relation {
    /**
     * The factions are the same or the players are in the same faction;
     */
    SAME,
    /**
     * The factions are allies
     * <p>
     * Allies typicaly can't damage each other.
     * Sometimes allies have permissions to interact with another factions' blocks.
     * The exact permissions given to allies can vary depending on the implementation
     * </p>
     */
    ALLY,
    /**
     * The factions have a truce
     * <p>
     * Factions at truce typicaly can't damage each other.
     * The exact permissions given to truced factions can vary depending on the implementation.
     * </p>
     */
    TRUCE,
    /**
     * The factions are neutral
     * <p>
     * Neutrality is the default state between factions
     * The exact permissions given to neutral factions can vary depending on the implementation.
     * </p>
     */
    NEUTRAL,
    /**
     * The factions are enemies.
     * <p>
     * Enemies can almost always attack each other.
     * The exact permissions given to enemies can vary depending on the implementation.
     * </p>
     */
    ENEMY;
}