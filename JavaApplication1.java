/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.lang.Math;

import java.util.Scanner;   

/**
 *
 * @author 796628
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           double width; // value of width
           double length; // value of length
      
        
      
        Scanner sc = new Scanner (System.in); // putting 
        System.out.println("rectangle width is "); // input for width
        width = sc.nextDouble(); // scans for width
        System.out.println(" rectangle length is  "); // input for length
        length = sc.nextDouble(); // scans for length
        System.out.println(length*width);
        System.out.println("that is the area "); // stating that is the area
        double radius;
        double diameter;
        System.out.println("circle radius is: "); // asks the user to input the radius
         radius = sc.nextDouble(); // defines the radius
         diameter = (radius*radius); // the radius
         System.out.println(Math.PI*diameter); // prints out the area
         System.out.println("that is the area of a circle"); // prints out the circle
         double radius2;
         double height;
          System.out.println("radius for cylinder: "); // defines the radius for cylinder
         radius2 = sc.nextDouble(); // adds decimals
          System.out.println("height of cylinder is: "); // defines the height of cylinder
          height = sc.nextDouble(); // adds decimals of height
          double diameter2 = (radius*radius); // radius times radius
          System.out.println("the Volume is "); // defines the volume
          System.out.println(Math.PI*diameter2*height); // PI times diameter times height
          System.out.println("the surface area is"); // defines the surface area
          double Bye = (2*Math.PI*radius2*height); // adds decimals and PI times radius times height
          double Hello = (2*Math.PI*radius2*diameter2); // PI times radius times diameter
          System.out.println(Bye+Hello); // these are my variables
          double g = 9.8; // decimals
          double L; // adds decimals
            System.out.println("how long is your pendulum in meters: "); // defines how is the pendulum in meters
            L = sc.nextDouble(); // adds decimals
           double No = (g*L); 
           double square = (Math.sqrt(No)); // square root times my variable
           Double Ta = (Math.PI*2); 
           System.out.println("Time for one pendulum swing"); // defines pendulum swing
           System.out.println(square*Ta); // Square times Ta
          
          
          
     }
    
}
      
    
