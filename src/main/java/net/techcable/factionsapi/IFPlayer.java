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

import java.util.UUID;

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

    /**
     * Get this player's relation to the specified player
     *
     * @param player player to get relation to
     * @return the relation to the specified player
     */
    public Relation getRelation(IFPlayer player);

    /**
     * Get the player's rank in their faction
     *
     * @return the player's rank in their faction
     */
    public Rank getRank();

    /**
     * Get the player's faction
     *
     * <p>
     * Returns null if the player doesn't have a faction
     * </p>
     *
     * @return the player's faction or null if none
     */
    public IFaction getFaction();

    /**
     * Returns if this player can fight the specified player
     * <p>
     * By default people you are allied with, have a truce with, or are in the same faction can't fight you
     * </p>
     *
     * @param player the player to see if this can fight with
     * @return true if this player can fight with the specified player
     */
    public boolean canFight(IFPlayer player);
}