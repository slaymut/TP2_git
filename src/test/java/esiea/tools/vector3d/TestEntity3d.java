package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
public class TestEntity3d {

    @Test
    void TestEntity3dVoidConstructor() {
        Entity3d e = new Entity3d();
        assertEquals(0, e.x);
        assertEquals(0, e.y);
        assertEquals(0, e.z);
    }

    @Test
    void TestEntity3dCopyConstructor() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        Entity3d e2 = new Entity3d(e1);

        assertEquals(e2.x, e1.x);
        assertEquals(e2.y, e1.y);
        assertEquals(e2.z, e1.z);
    }
    @Test
    void TestEntity3dConstructor() {
        Entity3d e1 = new Entity3d(1, 2, 3);

        assertEquals(1, e1.x);
        assertEquals(2, e1.y);
        assertEquals(3, e1.z);
    }
    @Test
    void TestToString() {
        Entity3d e1 = new Entity3d(1, 2, 3);

        assertEquals("(1.0,2.0,3.0)", e1.toString());
    }

    @Test
    void TestScale() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        e1.scale(3);

        assertEquals(1*3, e1.x);
        assertEquals(2*3, e1.y);
        assertEquals(3*3, e1.z);
    }

    @Test
    void TestScaleEntity() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        Entity3d e2 = new Entity3d(4, 5, 6);
        e1.scale(3, e2);

        assertEquals(3*e2.x, e1.x);
        assertEquals(3*e2.y, e1.y);
        assertEquals(3*e2.z, e1.z);
    }

    @Test
    void TestAdd() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        Entity3d e2 = new Entity3d(4, 5, 6);
        e1.add(e2);

        assertEquals(5, e1.x);
        assertEquals(7, e1.y);
        assertEquals(9, e1.z);
    }

    @Test
    void TestHashCode() {
        // A CHANGER !!!!!!!!!!!!!!!!
        Entity3d e1 = new Entity3d(1, 1, 1);
        System.out.println(e1.hashCode());
    }

    @Test
    void TestEquals() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        Entity3d e2 = new Entity3d(1, 2, 3);

        assertTrue(e1.equals(e2));
     }

    @Test
    void TestEpsilonEquals() {
        Entity3d e1 = new Entity3d(1, 2, 3);
        Entity3d e2 = new Entity3d(1, 3, 5);

        assertTrue(e1.epsilonEquals(e2, 3));
        assertFalse(e1.epsilonEquals(e2, 1));
    }
}