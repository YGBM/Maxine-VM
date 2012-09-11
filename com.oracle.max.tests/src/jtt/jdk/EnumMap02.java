/*
 * Copyright (c) 2007, 2012, Oracle and/or its affiliates. All rights reserved.
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
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package jtt.jdk;

import java.util.*;

/*
 * @Harness: java
 * @Runs: 0 = "A"; 1 = "B"; 2 = "C"
 */
public class EnumMap02 {

    public static String test(int i) {
        EnumMap<Enum, String> map = new EnumMap<Enum, String>(Enum.class);
        map.put(Enum.A, "A");
        map.put(Enum.B, "B");
        map.put(Enum.C, "C");
        return map.get(Enum.values()[i]);
    }

    private enum Enum {
        A, B, C
    }
}
