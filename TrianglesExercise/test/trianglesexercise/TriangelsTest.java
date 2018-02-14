/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglesexercise;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author philliphbrink
 */
public class TriangelsTest {
    
    public TriangelsTest() {
    }

    /**
     * Test of searchTriangle method, of class Triangels.
     */
    @Test
    public void testIsTriange() {
        System.out.println("Not a Triangle");
        int sideA = 0;
        int sideB = 1;
        int sideC = 0;
        Triangels instance = new Triangels();
        assertFalse(instance.isTriangle(sideA, sideB, sideC));
    }
    
    /**
     * Test of searchTriangle method, of class Triangels.
     */
    @Test
    public void testIsEquilateral() {
        System.out.println("Equilateral");
        int sideA = 3;
        int sideB = 3;
        int sideC = 3;
        Triangels instance = new Triangels();
        assertTrue(instance.isEquilateral(sideA, sideB, sideC));
    }
    
    /**
     * Test of searchTriangle method, of class Triangels.
     */
    @Test
    public void testIsIsosceles() {
        System.out.println("Isosceles");
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        Triangels instance = new Triangels();
        assertTrue(instance.isIsosceles(sideA, sideB, sideC));
    }
    
    /**
     * Test of searchTriangle method, of class Triangels.
     */
    @Test
    public void testIsScaled() {
        System.out.println("Scaled");
        int sideA = 3;
        int sideB = 5;
        int sideC = 6;
        Triangels instance = new Triangels();
        assertTrue(instance.isScalene(sideA, sideB, sideC));
    }
    
    /**
     * Test of searchTriangle method, of class Triangels.
     */
    @Test
    public void testClass() {
        System.out.println("Scaled");
        int sideA = 3;
        int sideB = 5;
        int sideC = 6;
        Triangels instance = new Triangels();
        assertEquals(instance.searchTriangle(sideA, sideB, sideC), "Scalene Triangle");
    }
    
}
