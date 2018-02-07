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
public class TrianglesExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangels t = new Triangels();
        // IDE Usage
       /*
        System.out.println("Ret - " + t.controlTiangle(4, 4, 4));
        System.out.println("Lige - " + t.controlTiangle(4, 3, 4));
        System.out.println("ikke noget - " + t.controlTiangle(4, 3, 2));
        */
        // Commandline Usage
        System.out.println(t.controlTiangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }

}
