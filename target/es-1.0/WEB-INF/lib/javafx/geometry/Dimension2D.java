/*
 * Copyright (c) 2008, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.geometry;

import javafx.beans.NamedArg;


/**
 * A 2D dimension object that contains a width and a height.
 *
 * @since JavaFX 2.0
 */
public class Dimension2D {
    /**
     * Constructs a <code>Dimension2D</code> with the specified width and
     * height.
     *
     * @param width the width
     * @param height the height
     */
    public Dimension2D(@NamedArg("width") double width, @NamedArg("height") double height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * The width of the dimension.
     *
     * @defaultValue 0.0
     */
    private double width;

    /**
     * The width of the dimension.
     * @return the width of the dimension
     */
    public final double getWidth() {
        return width;
    }
    
    /**
     * The height of the dimension.
     *
     * @defaultValue 0.0
     */
    private double height;

    /**
     * The height of the dimension.
     * @return the height of the dimension
     */
    public final double getHeight() {
        return height;
    }

    /**
     * Cache the hash code to make computing hashes faster.
     */
    private int hash = 0;

    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * @param obj the reference object with which to compare
     * @return true if this Dimension2D instance is the same as the obj argument; false otherwise
     */
    @Override public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Dimension2D) {
            Dimension2D other = (Dimension2D) obj;
            return getWidth() == other.getWidth() && getHeight() == other.getHeight();
        } else return false;
    }

    /**
     * Returns a hash code value for the Dimension2D object.
     * @return a hash code value for the Dimension2D object.
     */
    @Override public int hashCode() {
        if (hash == 0) {
            long bits = 7L;
            bits = 31L * bits + Double.doubleToLongBits(getWidth());
            bits = 31L * bits + Double.doubleToLongBits(getHeight());
	    hash = (int) (bits ^ (bits >> 32));
        }
        return hash;
    }

    /**
     * Returns a string representation of this {@code Dimension2D}.
     * This method is intended to be used only for informational purposes.
     * The content and format of the returned string might vary between
     * implementations.
     * The returned string might be empty but cannot be {@code null}.
     */
    @Override public String toString() {
        return "Dimension2D [width = " + getWidth() + ", height = " + getHeight() + "]";
    }
}
