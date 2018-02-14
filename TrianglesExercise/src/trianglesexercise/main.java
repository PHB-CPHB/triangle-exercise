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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangels t = new Triangels();
        // IDE Usage
       
        System.out.println("Equilateral Triangle - " + t.searchTriangle(4, 4, 4));
        System.out.println("Isosceles Triangle - " + t.searchTriangle(4, 3, 4));
        System.out.println("Scalene Triangle - " + t.searchTriangle(4, 4, 2));
        System.out.println("Not a Triangle - " + t.searchTriangle(4, 0, 2));
       
        // Commandline Usage
        /*
        System.out.println(t.isTriangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        */
    }

}
