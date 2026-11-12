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
public class RunMyPrograms 
{
    public static void main(String[] args)
    {
        RunMyPrograms rmp = new RunMyPrograms();
        rmp.menu();
    }

    public void menu() 
    {
       MyPrograms mp = new MyPrograms();
       Scanner sc = new Scanner (System.in);
       
       int input = 0;
       
       do
       {
          System.out.println("1) Arrays");
          System.out.println("2) ");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          
          
            input = sc.nextInt();
           
           
           
       }while(input !=-99);
       
       
       
       
       
       
    }
    
    
    
    
    
}
