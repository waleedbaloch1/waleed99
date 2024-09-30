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
        System.out.println("width is "); // input for width
        width = sc.nextDouble(); // scans for width
        System.out.println(" length is  "); // input for length
        length = sc.nextDouble(); // scans for length
        System.out.println(length*width);
        System.out.println("that is the area"); // stating taht is the area
        double radius;
        double diameter;
        System.out.println("radius is: ");
         radius = sc.nextDouble();
         diameter = (radius*radius);
         System.out.println(Math.PI*diameter);
         System.out.println("that is the area of a circle");
         double radius2;
         double height;
          System.out.printf("radius is: ");
          radius2 = sc.nextDouble();
          System.out.println("height is:");
          height = sc.nextDouble();
          double diameter2 = (radius*radius);
          System.out.println("the Volume is ");
          System.out.println(Math.PI*diameter2*height);
          System.out.println("the surface area is");
          double Bye = (2*Math.PI*radius2*height);
          double Hello = (2*Math.PI*radius2*diameter2);
          System.out.print(Bye+Hello);
          double g = 9.8;
          double L;
            System.out.println("meters are: ");
            L = sc.nextDouble();
           double No = (g*L);
           double square = (Math.sqrt(No));
           Double Ta = (Math.PI*2);
           System.out.println("Time for one pendulum swing");
           System.out.println(square*Ta);
          
          
          
     }
    
}

    
