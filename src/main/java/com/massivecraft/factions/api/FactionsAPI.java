package com.massivecraft.factions.api;

/**
 * A version independent API for factions
 * 
 */
public class FactionsAPI {
    
    /**
     * Get the faction with the specified id
     * 
     * @param id get the faction with this id
     * @return the faction with the specified id
     */
    public IFaction getFaction(String id);
    
    /**
     * Get the faction with the specified name
     * 
     * <p>
     * Prefer {@link #getFaction} as ids persist across faction name changes
     * This method's only real usage scenerio is getting a faction when a user types a command
     * </p>
     * 
     * @param tag name of the faction to retreive
     * @return the faction with the specified name
     */
    public IFaction getFactionByTag(String tag);
}