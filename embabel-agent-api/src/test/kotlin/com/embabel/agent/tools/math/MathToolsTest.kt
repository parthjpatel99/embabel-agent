/*
 * Copyright 2024-2025 Embabel Software, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.embabel.agent.tools.math

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MathToolsTest {

    private val mathTools = MathTools()

    @Test
    fun testMean() {
        assertEquals(3.0, mathTools.mean(listOf(1.0, 2.0, 3.0, 4.0, 5.0)))
        assertEquals(2.5, mathTools.mean(listOf(1.0, 2.0, 3.0, 4.0)))
        assertEquals(0.0, mathTools.mean(emptyList()))
        assertEquals(42.0, mathTools.mean(listOf(42.0)))
        assertEquals(0.0, mathTools.mean(listOf(-5.0, 5.0)))
    }

    @Test
    fun testMin() {
        assertEquals(1.0, mathTools.min(listOf(1.0, 2.0, 3.0, 4.0, 5.0)))
        assertEquals(-5.0, mathTools.min(listOf(1.0, -5.0, 3.0, 4.0)))
        assertEquals(42.0, mathTools.min(listOf(42.0)))
        assertEquals(Double.NaN, mathTools.min(emptyList()))
    }

    @Test
    fun testMax() {
        assertEquals(5.0, mathTools.max(listOf(1.0, 2.0, 3.0, 4.0, 5.0)))
        assertEquals(10.0, mathTools.max(listOf(1.0, -5.0, 3.0, 10.0)))
        assertEquals(42.0, mathTools.max(listOf(42.0)))
        assertEquals(Double.NaN, mathTools.max(emptyList()))
    }

    @Test
    fun testFloor() {
        assertEquals(3.0, mathTools.floor(3.7))
        assertEquals(3.0, mathTools.floor(3.0))
        assertEquals(-4.0, mathTools.floor(-3.2))
        assertEquals(0.0, mathTools.floor(0.9))
    }

    @Test
    fun testCeiling() {
        assertEquals(4.0, mathTools.ceiling(3.7))
        assertEquals(3.0, mathTools.ceiling(3.0))
        assertEquals(-3.0, mathTools.ceiling(-3.2))
        assertEquals(1.0, mathTools.ceiling(0.9))
    }

    @Test
    fun testRound() {
        assertEquals(4.0, mathTools.round(3.7))
        assertEquals(3.0, mathTools.round(3.0))
        assertEquals(-3.0, mathTools.round(-3.2))
        assertEquals(1.0, mathTools.round(0.9))
        assertEquals(0.0, mathTools.round(0.4))
    }
}
