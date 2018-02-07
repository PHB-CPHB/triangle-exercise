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

    public Triangels() {
    }
    
    public String controlTiangle(int sideA, int sideB, int sideC){
        if(sideA > 0&& sideB > 0 && sideC >0){
            String result;
            if (sideA == sideB && sideB == sideC){
                result = "Equilateral Triangle";
            } else if ( sideA == sideB||sideB == sideC||sideA == sideC){
                result = "Isosceles Triangle";
            } else {
                result = "Scalene Triangle";
            }
            return result;
        }
        return "Not a triangle";
    }
    
}
