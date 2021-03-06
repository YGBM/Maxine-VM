/*
 * Copyright (c) 2017, APT Group, School of Computer Science,
 * The University of Manchester. All rights reserved.
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package com.sun.max.collect;

import java.util.*;

/**
 * An implementation of a pool based on an array.
 */
public class ArrayPool<T extends PoolObject> extends Pool<T> {

    protected final T[] objects;

    @SuppressWarnings("unchecked")
    public ArrayPool(T... objects) {
        this.objects = objects;
    }

    @Override
    public T get(int serial) {
        return objects[serial];
    }

    @Override
    public int length() {
        return objects.length;
    }

    public Iterator<T> iterator() {
        return Arrays.asList(objects).iterator();
    }
}
