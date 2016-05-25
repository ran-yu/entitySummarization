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

package javafx.animation;

/**
Builder class for javafx.animation.RotateTransition
@see javafx.animation.RotateTransition
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class RotateTransitionBuilder extends javafx.animation.TransitionBuilder<javafx.animation.RotateTransitionBuilder> implements javafx.util.Builder<javafx.animation.RotateTransition> {
    protected RotateTransitionBuilder() {
    }
    
    /** Creates a new instance of RotateTransitionBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.animation.RotateTransitionBuilder create() {
        return new javafx.animation.RotateTransitionBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.animation.RotateTransition x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setAxis(this.axis);
        if ((set & (1 << 1)) != 0) x.setByAngle(this.byAngle);
        if ((set & (1 << 2)) != 0) x.setDuration(this.duration);
        if ((set & (1 << 3)) != 0) x.setFromAngle(this.fromAngle);
        if ((set & (1 << 4)) != 0) x.setNode(this.node);
        if ((set & (1 << 5)) != 0) x.setToAngle(this.toAngle);
    }
    
    private javafx.geometry.Point3D axis;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getAxis() axis} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder axis(javafx.geometry.Point3D x) {
        this.axis = x;
        __set |= 1 << 0;
        return this;
    }
    
    private double byAngle;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getByAngle() byAngle} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder byAngle(double x) {
        this.byAngle = x;
        __set |= 1 << 1;
        return this;
    }
    
    private javafx.util.Duration duration;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getDuration() duration} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder duration(javafx.util.Duration x) {
        this.duration = x;
        __set |= 1 << 2;
        return this;
    }
    
    private double fromAngle;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getFromAngle() fromAngle} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder fromAngle(double x) {
        this.fromAngle = x;
        __set |= 1 << 3;
        return this;
    }
    
    private javafx.scene.Node node;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getNode() node} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder node(javafx.scene.Node x) {
        this.node = x;
        __set |= 1 << 4;
        return this;
    }
    
    private double toAngle;
    /**
    Set the value of the {@link javafx.animation.RotateTransition#getToAngle() toAngle} property for the instance constructed by this builder.
    */
    public javafx.animation.RotateTransitionBuilder toAngle(double x) {
        this.toAngle = x;
        __set |= 1 << 5;
        return this;
    }
    
    /**
    Make an instance of {@link javafx.animation.RotateTransition} based on the properties set on this builder.
    */
    public javafx.animation.RotateTransition build() {
        javafx.animation.RotateTransition x = new javafx.animation.RotateTransition();
        applyTo(x);
        return x;
    }
}
