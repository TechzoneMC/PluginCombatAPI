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
 * The relation between two {@link IFaction}
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