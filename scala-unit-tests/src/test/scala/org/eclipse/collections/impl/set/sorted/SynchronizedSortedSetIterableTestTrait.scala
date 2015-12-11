/*******************************************************************************
 * Copyright (c) 2015 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/

package org.eclipse.collections.impl.set.sorted

import org.junit.Test
import org.eclipse.collections.api.set.sorted.SortedSetIterable
import org.eclipse.collections.impl.set.SynchronizedSetIterableTestTrait

trait SynchronizedSortedSetIterableTestTrait extends SynchronizedSetIterableTestTrait
{
    val classUnderTest: SortedSetIterable[String]

    @Test
    def powerSet_synchronized
    {
        this.assertSynchronized(this.classUnderTest.powerSet())
    }
}