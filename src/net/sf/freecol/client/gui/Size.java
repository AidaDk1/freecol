/**
 *  Copyright (C) 2002-2020   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui;

/**
 * Standard sizes.
 */
public enum Size {

    TINY   (0.25f, 12f),
    SMALLER(0.5f,  16f),
    SMALL  (0.75f, 24f),
    NORMAL (1.0f,  36f),
    LARGE  (1.25f, 48f),
    BIG    (1.5f,  48f),
    HUGE   (1.75f, 48f),
    MAX    (2.0f,  48f);

    /** The scaling value to use for images. */
    private final float image;
    /** The value to use for font point sizes. */
    private final float font;

    Size(float image, float font) {
        this.image = image;
        this.font = font;
    }

    public float forImage() {
        return this.image;
    }

    public float forFont() {
        return this.font;
    }
    
    public Size up() {
        return (this == Size.MAX) ? Size.MAX
            : this.values()[this.ordinal() + 1];
    }

    public Size down() {
        return (this == Size.TINY) ? Size.TINY
            : this.values()[this.ordinal() - 1];
    }
};
