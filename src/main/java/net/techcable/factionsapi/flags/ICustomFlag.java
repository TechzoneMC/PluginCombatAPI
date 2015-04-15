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
package net.techcable.factionsapi.flags;

import net.techcable.factionsapi.IFaction;

/**
 * Represents a custom faction setting, which is an named editable boolean for a faction
 * <p>
 * Many implementations don't support faction flags
 * For those that do, a new flag can be created via {@link FactionsAPI}
 * </p>
 */
public interface ICustomFlag {
    /**
     * Get the name of the flag
     *
     * @return the name of the flag
     */
    public String getName();

    /**
     * Get the value of this flag for the specified faction
     *
     * @param f the faction to get the value in
     *
     * @return the value of this flag
     */
    public boolean getValue(IFaction f);

    /**
     * Sets the value of the flag in the specified faction to the specified value
     *
     * @param f the faction the faction to set for
     * @param value the value of the flag in the given faction
     */
    public void setValue(IFaction f, boolean value);
}