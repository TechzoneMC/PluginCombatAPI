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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * The FactionsAPI core, for version and implementation singleton handling
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FactionsAPI {

    @Getter
    @Setter
    private static IFactionsPlugin implemenetation;

    //
    //Delegates
    //

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
    public static IFPlayer getFPlayer(UUID id) {
        return getImplemenetation().getFPlayer(id);
    }

    /**
     * Get the faction with the specified id
     *
     * @param id get the faction with this id
     * @return the faction with the specified id
     */
    public static IFaction getFaction(String id) {
        return getImplemenetation().getFaction(id);
    }

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
    public static IFaction getWarzone() {
        return getImplemenetation().getWarzone();
    }

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
    public static IFPlayer getFPlayer(Player player) {
        return getImplemenetation().getFPlayer(player);
    }

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
    public static IFaction getSafezone() {
        return getImplemenetation().getSafezone();
    }

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
    public static IFPlayer getFPlayer(OfflinePlayer player) {
        return getImplemenetation().getFPlayer(player);
    }

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
    public static IFaction getNone() {
        return getImplemenetation().getNone();
    }

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
    public static IFaction getFactionByTag(String tag) {
        return getImplemenetation().getFactionByTag(tag);
    }
}