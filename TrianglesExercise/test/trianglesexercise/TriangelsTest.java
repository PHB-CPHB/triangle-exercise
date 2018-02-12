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
        System.out.println("\"Equilateral Triangle Input 2, 2, 2\"");
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
        System.out.println("\"Isosceles Triangle Input 2, 2, 3\"");
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
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
        System.out.println("\"Scalene Triangle Input 2, 3, 4\"");
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
        System.out.println("\"Not a triangle Input 0, 2, 3\"");
        int sideA = 0;
        int sideB = 2;
        int sideC = 3;
        Triangels instance = new Triangels();
        String expResult = "Not a triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testNotATiangleTwo() {
        System.out.println("\"Not a triangle Input 2, -1, 4\"");
        int sideA = 2;
        int sideB = -1;
        int sideC = 4;
        Triangels instance = new Triangels();
        String expResult = "Not a triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlTiangle method, of class Triangels.
     */
    @Test
    public void testEquilateralTiangleTwo() {
        System.out.println("\"Equilateral Triangle Input 50,50,50\"");
        int sideA = 50;
        int sideB = 50;
        int sideC = 50;
        Triangels instance = new Triangels();
        String expResult = "Equilateral Triangle";
        String result = instance.controlTiangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
}
