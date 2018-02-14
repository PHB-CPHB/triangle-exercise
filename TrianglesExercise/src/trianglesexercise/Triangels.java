/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglesexercise;

/**
 *
 * @author philliphbrink
 */
public class Triangels {
    
    public String searchTriangle(int sideA, int sideB, int sideC){
        if (isEquilateral(sideA, sideB, sideC)){
            return "Equilateral Triangle";
        } else if(isIsosceles(sideA, sideB, sideC)){
            return "Isosceles Triangle";
        } else if (isScalene(sideA, sideB, sideC)) {
            return "Scalene Triangle";
        } else {
            return "Not a triangle";
        }
    }
    
    public boolean isTriangle(int sideA, int sideB, int sideC){
        return ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA);
    }
    
    public boolean isScalene(int sideA, int sideB, int sideC){
        return isTriangle(sideA, sideB, sideC);
    }
    
    public boolean isEquilateral(int sideA, int sideB, int sideC){
        return isTriangle(sideA, sideB, sideC) ? sideA == sideB && sideB == sideC : false;
    }
    
    public boolean isIsosceles(int sideA, int sideB, int sideC){
        return isTriangle(sideA, sideB, sideC) ? sideA == sideB||sideB == sideC||sideA == sideC : false;
    }
    
}
