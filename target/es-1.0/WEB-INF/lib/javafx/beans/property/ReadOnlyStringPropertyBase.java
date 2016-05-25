/*
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javafx.beans.property;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;

import com.sun.javafx.binding.ExpressionHelper;

/**
 * Base class for all readonly properties wrapping a {@code String}. This class provides a default
 * implementation to attach listener.
 *
 * @see ReadOnlyStringProperty
 * @since JavaFX 2.0
 */
public abstract class ReadOnlyStringPropertyBase extends ReadOnlyStringProperty {
    
    ExpressionHelper<String> helper;

    @Override 
    public void addListener(InvalidationListener listener) {
        helper = ExpressionHelper.addListener(helper, this, listener);
    }

    @Override 
    public void removeListener(InvalidationListener listener) {
        helper = ExpressionHelper.removeListener(helper, listener);
    }
    
    @Override
    public void addListener(ChangeListener<? super String> listener) {
        helper = ExpressionHelper.addListener(helper, this, listener);
    }

    @Override 
    public void removeListener(ChangeListener<? super String> listener) {
        helper = ExpressionHelper.removeListener(helper, listener);
    }
    
    /**
     * Sends notifications to all attached
     * {@link javafx.beans.InvalidationListener InvalidationListeners} and
     * {@link javafx.beans.value.ChangeListener ChangeListeners}.
     * 
     * This method needs to be called, if the value of this property changes.
     */
    protected void fireValueChangedEvent() {
        ExpressionHelper.fireValueChangedEvent(helper);
    }
    
}
