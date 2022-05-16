package esiea.tools.vector3d;

import esiea.tools.math.Math;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    public void testAddIntInt() {
        assertEquals(Math.add(0, 1), 1);
        assertEquals(Math.add(-6, 6), 0);
    }
}