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

/**
 * Represents all the ranks a {@link IFPlayer} can have within a faction
 * 
 */
public enum Rank {
    /**
     * A player with this rank owns the faction
     * <p>
     * There can only be one owner
     * Owners have the highest rank, and have permission to do almost anything in their faction.
     * Owners can do anything moderators can do, but can also:
     * <ul>
     *   <li>Rename the Faction</li>
     *   <li>Premote or demote moderators</li>
     *   <li>Transfer ownership of the faction</li>
     *   <li>Kick moderators</li>
     * </ul>
     * </p>
     */
    OWNER,
    /**
     * A player with this rank moderates the Faction<p>
     * <p>
     * Moderators have the second highest rank and have various administrative permissions
     * Moderators can usually do anything members can do.
     * The exact permissions moderators have vary depending on the implementation.
     * </p>
     */
    MODERATOR,
    /**
     * A member in the faction.
     * <p>
     * Members are the default rank in most implementations.
     * Members can usually break and place blocks.
     * The exact permissions members have vary depending on the implementation.
     * </p>
     */
    MEMBER,
    /**
     * A recruit in the faction.
     * <p>
     * Recruits <b>may or may not be implemented</b>.
     * Recruits are the default rank in some implementations.
     * Recruits usually only have the permission to interact with blocks.
     * The exact permissions very depending on the implementation.
     * </p>
     */
    RECRUIT;
}