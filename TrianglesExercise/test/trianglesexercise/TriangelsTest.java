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
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testEquilateralTiangle() {
        System.out.println("\"Equilateral Triangle\"");
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        Triangels instance = new Triangels();
        String expResult = "Equilateral Triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testIsoscelesTiangle() {
        System.out.println("\"Isosceles Triangle\"");
        int sideA = 2;
        int sideB = 2;
        int sideC = 4;
        Triangels instance = new Triangels();
        String expResult = "Isosceles Triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testScaleneTiangle() {
        System.out.println("\"Scalene Triangle\"");
        int sideA = 2;
        int sideB = 3;
        int sideC = 4;
        Triangels instance = new Triangels();
        String expResult = "Scalene Triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testNotATiangle() {
        System.out.println("\"Not a triangle\"");
        int sideA = 0;
        int sideB = 3;
        int sideC = 4;
        Triangels instance = new Triangels();
        String expResult = "Not a triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
}
