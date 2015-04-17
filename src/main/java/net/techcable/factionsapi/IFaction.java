/**
 * The MIT License
 * Copyright (c) 2014-2015 Techcable
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.techcable.factionsapi;

import net.techcable.factionsapi.flags.FactionSettings;

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
     * @see FactionsAPI#getSafezone()
     */
    public boolean isSafezone();
    
    /**
     * Returns true if this faction is a warzone
     * 
     * @return if this faction is the warzone
     * @see FactionsAPI#getWarzone()
     */
    public boolean isWarzone();
    
    /**
     * Returns true if this faction is the wilderness
     * 
     * @return if this faction is the wilderness
     * @see FactionsAPI#getNone()
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

    /**
     * Get this faction's relation to the specified player.
     *
     * @param other the player to get this factions relation to
     * @retun this faction's relation to the given player
     */
    public Relation getRelation(IFPlayer other);

    /**
     * Whether this faction is considered 'offline'
     * <p>
     * Useful for {@link net.techcable.factionsapi.flags.FactionSettings#isOfflineExplosions()}
     * </p>
     *
     * @return if the faction is offline
     */
    public boolean isOffline();

    /**
     * Get the faction's power
     *
     * <p>
     * Power allows factions to claim land
     * Power is lost on death unless {@link net.techcable.factionsapi.flags.FactionSettings#isPermanent()} is false
     * </p>
     *
     * @return the faction's power
     */
    public double getPower();

    /**
     * Get the amount of money the faction has
     *
     *
     * @return the amount of money the faction has
     */
    public double getBalance();

    /**
     * Set the amount of money the faction has
     *
     * @param balance the new faction balance
     */
    public void setBalance(double balance);
    
    /**
     * Get the faction's settings
     * <p>
     * A faction's settings controls prefrences such as open, whether monsters can spawn, etc...
     * </p>
     * 
     * @return the faction's settings
     */
    public FactionSettings getSettings();
}
