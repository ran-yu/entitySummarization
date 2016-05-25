/*
 * Copyright (c) 2010, 2014, Oracle and/or its affiliates. All rights reserved.
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

package javafx.css;

import javafx.scene.text.Font;

/**
 * A representation of a parsed CSS value. {@code V} is the type of the parsed
 * value, {@code T} is the {@code StyleableProperty} type of the converted value.
 * Instances of {@code ParsedValue} are created by the CSS parser. For example,
 * the parser creates a {@code ParsedValue&lt;String,Color&gt;} when it parses a
 * web Color. 
 * <p>
 * A ParsedValue is meaningful to the code that calculates actual values from
 * parsed CSS values. Elsewhere the value returned by 
 * {@link #getValue()} is likely to be obscure, abstruse and perplexing. 
 * @since JavaFX 8.0
 */
public class ParsedValue<V, T> {

    /**
     * The CSS property value as created by the parser.
     */
    final protected V value;
    
    /**
     * @return The CSS property value as created by the parser, which may be null
     * or otherwise incomprehensible.
     */
    public final V getValue() { return value; }

    /**
     * The {@code StyleConverter} which converts the parsed value to 
     * the type of the {@link StyleableProperty}. This may be null, in which
     * case {@link #convert(javafx.scene.text.Font) convert}
     * will return {@link #getValue() getValue()}
     */
    final protected StyleConverter<V, T> converter;
    
    /**
     * A {@code StyleConverter} converts the parsed value to 
     * the type of the {@link StyleableProperty}. If the {@code StyleConverter}
     * is null, {@link #convert(javafx.scene.text.Font)}
     * will return {@link #getValue()}
     * @return The {@code StyleConverter} which converts the parsed value to 
     * the type of the {@link StyleableProperty}. May return null.
     */
    public final StyleConverter<V, T> getConverter() { return converter; }

    /**
     * Convenience method for calling 
     * {@link StyleConverter#convert(javafx.css.ParsedValue, javafx.scene.text.Font) convert}
     * on this {@code ParsedValue}.
     * @param font         The {@link Font} to use when converting a
     * <a href="http://www.w3.org/TR/css3-values/#relative-lengths">relative</a>
     * value.
     * @return The value converted to the type of the {@link StyleableProperty}
     * @see #getConverter() 
     */
    @SuppressWarnings("unchecked")
    public T convert(Font font) {
        // unchecked!
        return (T)((converter != null) ? converter.convert(this, font) : value);
    }
    
    /**
     * Create an instance of ParsedValue where the value type V is converted to
     * the target type T using the given converter.
     * If {@code converter} is null, then it is assumed that the type of value 
     * {@code V} and the type of target {@code T} are the same and
     * do not need converted.
     */
    protected ParsedValue(V value, StyleConverter<V, T> converter) {
        this.value = value;
        this.converter = converter;
    }

}
