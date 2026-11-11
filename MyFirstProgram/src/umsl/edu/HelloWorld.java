/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.util.Scanner;

/**
 *
 * @author New
 */
public class HelloWorld
        
{
   public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld(); 
        hw.menu();
    }
//        hw.sum();
//        hw.difference();
//        hw.product();
//        hw.quotient();
//        hw.remainder();
        
//       Scanner sc = new Scanner(System.in);
//       int x;
//       int y;
//       int z;
//       System.out.println("Hello World");
//       System.out.println("Please enter your first number: ");
//       x = sc.nextInt();
//       System.out.println("Please enter your second number: ");
//       y = sc.nextInt();
//        int x = 10;
//        int y = 20;
//        int z;
//       z = x + y;
//       System.out.println("The sum is:" + z);
//        
//        z = x - y;
//        System.out.println("The difference is:" + z);
    
   
   public void menu()
   {
       int input = -99; 
       Scanner sc = new Scanner (System.in);
       
       do
       {
           System.out.println("Please enter your selection");
           System.out.println("1) Sum");
           System.out.println("2) Differnce");
           System.out.println("3) Product");
           System.out.println("4) Quotient");
           System.out.println("5) Remainder");
           System.out.println("6) Exit");
          
           input = sc.nextInt();
           
           if(input == 1)
           {
               sum();
           }
           else if(input == 2)
           {
               difference();
           }
           else if(input == 3)
           {
               product();
           }
          else if(input == 4)
           {
               quotient();
           }
           else if(input == 5)
           {
               remainder();
           }
       }while(input != 6);
   }
   
   public void sum()
   {
       Scanner sc = new Scanner(System.in);
       int x;
       int y;
       int z;
       //System.out.println("Hello World");
       System.out.println("Please enter your first number: ");
       x = sc.nextInt();
       System.out.println("Please enter your second number: ");
       y = sc.nextInt();
       z = x + y;
       System.out.println("The sum is:" + z);
   }
   
   public void difference()
   {
       Scanner sc = new Scanner(System.in);
       int x;
       int y;
       int z;
       //System.out.println("Hello World");
       System.out.println("Please enter your first number: ");
       x = sc.nextInt();
       System.out.println("Please enter your second number: ");
       y = sc.nextInt();
       z = x - y;
       System.out.println("The difference is:" + z);
   }
public void product()
   {
       Scanner sc = new Scanner(System.in);
       int x;
       int y;
       int z;
       //System.out.println("Hello World");
       System.out.println("Please enter your first number: ");
       x = sc.nextInt();
       System.out.println("Please enter your second number: ");
       y = sc.nextInt();
       z = x * y;
       System.out.println("The product is:" + z);
   }
public void quotient()
   {
       Scanner sc = new Scanner(System.in);
       float xf;
       float yf;
       float zf;
       //System.out.println("Hello World");
       System.out.println("Please enter your first number: ");
       xf = sc.nextInt();
       System.out.println("Please enter your second number: ");
       yf = sc.nextInt();
       zf = xf / yf;
       System.out.println("The quotient is:" + zf);
   }
public void remainder()
   {
       Scanner sc = new Scanner(System.in);
       int x;
       int y;
       int z;
       //System.out.println("Hello World");
       System.out.println("Please enter your first number: ");
       x = sc.nextInt();
       System.out.println("Please enter your second number: ");
       y = sc.nextInt();
       z = x % y;
       System.out.println("The remainder is:" + z);
   }
}
