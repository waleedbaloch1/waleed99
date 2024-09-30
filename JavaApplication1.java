/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
import java.lang.Math;
import java.lang.Integer;

import java.util.Scanner;   



/**
 *
 * @author 796628
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length;
        int width;
      
        
      
        Scanner sc = new Scanner (System.in);
        System.out.println("length is ");
        width = sc.nextInt();
        System.out.println(" width is  ");
        length = sc.nextInt();
        System.out.println(length*width);
        System.out.println("that is the area");
        int radius;
        int diameter;
        System.out.println("radius is: ");
         radius = sc.nextInt();
         diameter = (radius*radius);
         System.out.println(Math.PI*diameter);
         System.out.println("that is the area of a circle");
         int radius2;
         int height;
          System.out.println("radius is: ");
          radius2 = sc.nextInt();
          System.out.println("height is:");
          height = sc.nextInt();
          int diameter2 = (radius*radius);
          System.out.println("the Volume is ");
          System.out.println(Math.PI*diameter2*height);
          System.out.println("the surface are is");
          double OK = (2*Math.PI*radius2*height);
          double Okay = (2*Math.PI*radius2*diameter2);
          System.out.print(OK+Okay);
          
     }
    
}
    

    
