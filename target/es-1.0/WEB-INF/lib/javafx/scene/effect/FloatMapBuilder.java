/* 
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
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

package javafx.scene.effect;

/**
Builder class for javafx.scene.effect.FloatMap
@see javafx.scene.effect.FloatMap
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class FloatMapBuilder<B extends javafx.scene.effect.FloatMapBuilder<B>> implements javafx.util.Builder<javafx.scene.effect.FloatMap> {
    protected FloatMapBuilder() {
    }
    
    /** Creates a new instance of FloatMapBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.effect.FloatMapBuilder<?> create() {
        return new javafx.scene.effect.FloatMapBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.scene.effect.FloatMap x) {
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setHeight(this.height);
        if ((set & (1 << 1)) != 0) x.setWidth(this.width);
    }
    
    private int height;
    /**
    Set the value of the {@link javafx.scene.effect.FloatMap#getHeight() height} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B height(int x) {
        this.height = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private int width;
    /**
    Set the value of the {@link javafx.scene.effect.FloatMap#getWidth() width} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B width(int x) {
        this.width = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.effect.FloatMap} based on the properties set on this builder.
    */
    public javafx.scene.effect.FloatMap build() {
        javafx.scene.effect.FloatMap x = new javafx.scene.effect.FloatMap();
        applyTo(x);
        return x;
    }
}
