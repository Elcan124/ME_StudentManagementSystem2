/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author elcan
 */
public class Util {
    
   public static String getString(String text){
       Scanner sc = new Scanner(System.in);
       System.out.println(text+" :");
       String s = sc.nextLine();
       return s;
       
   }
    public static double getDouble(String text){
       Scanner sc = new Scanner(System.in);
       System.out.println(text+" :");
      double d = sc.nextDouble();
       return d;
       
   }
     public static int getInt(String text){
       Scanner sc = new Scanner(System.in);
       System.out.println(text+" :");
      int i = sc.nextInt();
       return i;
       
   }
    
}
