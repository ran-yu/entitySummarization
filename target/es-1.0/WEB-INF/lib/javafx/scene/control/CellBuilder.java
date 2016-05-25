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

package javafx.scene.control;

/**
Builder class for javafx.scene.control.Cell
@see javafx.scene.control.Cell
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class CellBuilder<T, B extends javafx.scene.control.CellBuilder<T, B>> extends javafx.scene.control.LabeledBuilder<B> implements javafx.util.Builder<javafx.scene.control.Cell<T>> {
    protected CellBuilder() {
    }
    
    /** Creates a new instance of CellBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.CellBuilder<T, ?> create() {
        return new javafx.scene.control.CellBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.scene.control.Cell<T> x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setEditable(this.editable);
        if ((set & (1 << 1)) != 0) x.setItem(this.item);
    }
    
    private boolean editable;
    /**
    Set the value of the {@link javafx.scene.control.Cell#isEditable() editable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B editable(boolean x) {
        this.editable = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private T item;
    /**
    Set the value of the {@link javafx.scene.control.Cell#getItem() item} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B item(T x) {
        this.item = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.control.Cell} based on the properties set on this builder.
    */
    public javafx.scene.control.Cell<T> build() {
        javafx.scene.control.Cell<T> x = new javafx.scene.control.Cell<T>();
        applyTo(x);
        return x;
    }
}
