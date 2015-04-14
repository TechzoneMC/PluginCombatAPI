package com.massivecraft.factions.api;

/**
 * Represents a version independent player in the factions plugin
 * <p>
 * This player may or may not be online.
 * This player may or may not have a faction.
 * </p>
 * 
 */
public interface IFPlayer {
    /**
     * Get this players uuid
     * 
     * @return this players uuid
     */
    public UUID getId();
}