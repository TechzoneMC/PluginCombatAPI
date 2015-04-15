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
import net.techcable.factionsapi.flags.ICustomFlag;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * A faction plugin
 * 
 */
public interface IFactionsPlugin {

    /**
     * Get the FPlayer with the specified uuid
     *
     * <p>
     * If there is no FPlayer with the specified uuid doesn't exist this method will return null
     * </p>
     *
     * @param id the uuid of the player to get
     * @return the player with the specified uuid, or null if there is none
     */
    public IFPlayer getFPlayer(UUID id);

    /**
     * Convert the specified OfflinePlayer to an FPlayer
     *
     * <p>
     * If there is no FPlayer for the given player this method will return null
     * </p>
     *
     * @param player the player to convert to an FPlayer
     * @return the player as a FPlayer, or null if there is none
     */
    public IFPlayer getFPlayer(OfflinePlayer player);

    /**
     * Convert the specified Player to an FPlayer
     *
     * <p>
     * If there is no FPlayer for the given player this method will return null
     * </p>
     *
     * @param player the player to convert to an FPlayer
     * @return the player as a FPlayer, or null if there is none
     */
    public IFPlayer getFPlayer(Player player);

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

    /**
     * Get the safezone faction
     *
     * <p>
     * The safezone faction <b>never</b> has any members.
     * Territory in the safezone is protected from damage from everyone except admins.
     * Players can not fight in a safezone.
     * </p>
     *
     * @return the safezone faction
     */
    public IFaction getSafezone();


    /**
     * Get the warzone faction
     *
     * <p>
     * The warzone faction <b>never</b> has any members.
     * Territory in the warzone is protected from damage from everyone except admins.
     * Players can fight in a warzone.
     * </p>
     *
     * @return the warzone faction
     */
    public IFaction getWarzone();

    /**
     * Get the wilderness faction
     *
     * <p>
     * The wilderness faction is the faction players are put into by default
     * Territory in the wilderness has no protections at all.
     * Any faction can claim territory in the wilderness.
     * </p>
     *
     * @return the wilderness faction
     */
    public IFaction getNone();

    /**
     * Create a custom flag with the specified name
     *
     * <p>
     * If the flag with the specified name already exists
     * </p>
     *
     * @param name the name of the flag to create
     * @throws java.lang.UnsupportedOperationException if the implementation doesn't support custom flags
     * @return the custom flag
     */
    public ICustomFlag getOrCreateCustomFlag(String name);

    /**
     * Create a custom flag with the specified name
     *
     * <p>
     * If the flag with the specified name doesn't exist, reutnrs null
     * </p>
     *
     * @param name the name of the flag to get
     * @throws java.lang.UnsupportedOperationException if the implementation doesn't support custom flags
     * @return the custom flag, or null if it doesn't exist
     */
    public ICustomFlag getCustomFlag(String name);
}