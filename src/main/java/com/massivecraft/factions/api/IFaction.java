package com.massivecraft.factions.api;

import com.google.common.collect.ImmutableCollection;

/**
 * Represents a version independent faction
 * 
 */
public interface IFaction {
    /**
     * Get this factions id
     * <p>
     * An id is persistent, and won't change unless the faction is disbanded
     * Faction names on the other hand, can be changed by the faction owner
     * </p>
     * 
     * @return this faction's persistent id
     */
    public String getId();
    
    /**
     * Get this faction's name
     * <p>
     * A name can be changed at any time by a user, and should only be used to interface with a player.
     * Faction ids are persistent and are safe to be used in storage.
     * </p>
     * 
     * @return this faction's name
     */
    public String getName();
    
    /**
     * Get this faction's description
     * <p>
     * A name can be changed at any time by a user, and should only be used to display to a player.
     * </p>
     * 
     * @return this faction's description
     */
    public String getDescription();
    
    /**
     * Returns true if this faction is a safezone
     * 
     * @return if this faction is a safezone
     * @see com.massivecraft.factions.api.FactionsAPI#getSafezone()
     */
    public boolean isSafezone();
    
    /**
     * Returns true if this faction is a warzone
     * 
     * @return if this faction is the warzone
     * @see com.massivecraft.factions.api.FactionsAPI#getWarzone()
     */
    public boolean isWarzone();
    
    /**
     * Returns true if this faction is the wilderness
     * 
     * @return if this faction is the wilderness
     * @see com.massivecraft.factions.api.FactionsAPI#getNone()
     */
    public boolean isNone();
    
    /**
     * Returns the owner of this faction
     * <p>
     * <b>This should be used instead of {@link #getMembers(Rank)}</b>
     * Owners have the highest rank, and have permission to do almost anything in their faction.
     * Owners can do anything moderators can do, but can also:
     * <ul>
     *   <li>Rename the Faction</li>
     *   <li>Premote or demote moderators</li>
     *   <li>Transfer ownership of the faction</li>
     *   <li>Kick moderators</li>
     * </ul>
     * </p>
     * 
     * @return the owner of the faction
     */
    public IFPlayer getOwner();
    
    /**
     * Get all the members in the faction with the specified rank
     * <p>
     * If the rank is unsupported this method will return an empty collection
     * </p>
     * 
     * @param rank the rank to get all the members with
     * @return an unmodifiable copy of the members with the specified rank
     */
    public ImmutableCollection<? extends IFPlayer> getMembers(Rank rank);
    
    /**
     * Get all the members in the faction
     * 
     * @return an unmodifiable copy of all the members in the faction
     */
    public ImmutableCollection<? extends IFPlayer> getMembers();
    
    /**
     * Get all the factions that have the specified relation to this faction
     * <p>
     * If the relation is unsupported this method will return an empty collection
     * </p>
     * 
     * @param relation the relation to get all the factions with
     * @return an unmodifiable copy of the factions with the specified relation
     */
    public ImmutableCollection<? extends IFaction> getFactions(Relation relation);
    
    /**
     * Get this faction's relation to the specified faction.
     * 
     * @param other the faction to get this factions relation to
     * @retun this faction's relation to the other faction
     */
    public Relation getRelation(IFaction other);
}