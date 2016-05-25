/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
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
package com.sun.glass.ui.mac;

import java.nio.ByteBuffer;

import com.sun.glass.ui.Application;
import com.sun.glass.ui.Menu;
import com.sun.glass.ui.MenuItem.Callback;
import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.delegate.MenuBarDelegate;
import com.sun.glass.ui.delegate.MenuDelegate;
import com.sun.glass.ui.delegate.MenuItemDelegate;
import java.security.AccessController;
import java.security.PrivilegedAction;

class MacMenuDelegate implements MenuDelegate, MenuItemDelegate {

    private static native void _initIDs();
    static {
        _initIDs();
    }

    // GlassMenu *
    long ptr;

    // GlassMenu <-> Menu
    private Menu menu;
    public MacMenuDelegate(final Menu menu) {
        this.menu = menu;
    }
    
    public MacMenuDelegate() {
    }

    private native long _createMenu(String title, boolean enabled);
    @Override public boolean createMenu(String title, boolean enabled) {
        ptr = _createMenu(title, enabled);
        return ptr != 0;
    }

    private native long _createMenuItem(String title, char shortcut, int modifiers,
                                        Pixels icon, boolean enabled, boolean checked,
                                        Callback callback);
    
    @Override public boolean createMenuItem(String title, Callback callback, 
                                            int shortcutKey, int shortcutModifiers, Pixels pixels,
                                            boolean enabled, boolean checked) {
        ptr = _createMenuItem(title, (char)shortcutKey, shortcutModifiers,
                              pixels, enabled, checked, callback);
        return ptr != 0;
    }

    private native void _insert(long menuPtr, long submenuPtr, int pos);
    @Override public boolean insert(MenuDelegate menu, int pos) {
        MacMenuDelegate macMenu = (MacMenuDelegate)menu;
        _insert(ptr, macMenu.ptr, pos);
        return true;
    }

    @Override public boolean insert(MenuItemDelegate item, int pos) {
        MacMenuDelegate macMenu = (MacMenuDelegate)item;
        _insert(ptr, macMenu != null ? macMenu.ptr : 0, pos);
        return true;
    }

    private native void _remove(long menuPtr, long submenuPtr, int pos);
    @Override public boolean remove(MenuDelegate menu, int pos) {
        MacMenuDelegate macMenu = (MacMenuDelegate)menu;
        _remove(ptr, macMenu.ptr, pos);
        return true;
    }

    @Override public boolean remove(MenuItemDelegate item, int pos) {
        MacMenuDelegate macMenu = (MacMenuDelegate)item;
        _remove(ptr, macMenu == null ? 0L : macMenu.ptr, pos);
        return true;
    }

    private native void _setTitle(long menuPtr, String title);
    @Override public boolean setTitle(String title) {
        _setTitle(ptr, title);
        return true;
    }

    private native void _setShortcut(long menuPtr, char shortcut, int modifiers);
    @Override public boolean setShortcut(int shortcutKey, int shortcutModifiers) {
        _setShortcut(ptr, (char)shortcutKey, shortcutModifiers);
        return true;
    }

    private native void _setPixels(long menuPtr, Pixels pixels);
    @Override public boolean setPixels(Pixels pixels) {
        _setPixels(ptr, pixels);
        return true;
    }

    private native void _setEnabled(long menuPtr, boolean enabled);
    @Override public boolean setEnabled(boolean enabled) {
        _setEnabled(ptr, enabled);
        return true;
    }

    private native void _setChecked(long menuPtr, boolean checked);
    @Override public boolean setChecked(boolean checked) {
        _setChecked(ptr, checked);
        return true;
    }

    private native void _setCallback(long menuPtr, Callback callback);
    @Override public boolean setCallback(Callback callback) {
        _setCallback(ptr, callback);
        return true;
    }

}
