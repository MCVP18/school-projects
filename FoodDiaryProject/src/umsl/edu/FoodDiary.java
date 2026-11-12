/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author New
 */
public class FoodDiary 
{
    public static void main(String[] args) throws FileNotFoundException 
	{

        	PrintWriter pw = new PrintWriter(new File("YourFoodDiary.csv"));
        	StringBuilder sb = new StringBuilder();
        	
		sb.append("Date");
        	sb.append(',');
        	sb.append("FoodTime");
        	sb.append(',');
        	sb.append("FoodItem");
        	sb.append(',');
        	sb.append("Calories");
        	sb.append(',');
                sb.append("Carbohydrates");
        	sb.append(',');
        	sb.append("Sugar");
        	sb.append(',');
        	sb.append("Fiber");
        	sb.append(',');
        	sb.append("Protein");
                sb.append(',');
                sb.append("TotalFat");
        	sb.append('\n');

		
        	int exit;
         	Scanner sc = new Scanner (System.in);
                
		do 
		{   
                    System.out.println("Welcome to your Food Diary!!");
                    System.out.println("Need to keep track of what you ate!!\nWell I'm the perfect tool for you!!");
                    System.out.println("Go ahead! Add your first entry!");
                    System.out.println("\n");
                    
			System.out.println("Date: ");
            			String date = sc.next();
            		System.out.println("Food Time(Breakfast/Lunch/Dinner/Snack): ");
            			String foodTime = sc.next();
            		System.out.println("Food Item: ");
            			String foodItem = sc.next();
            		System.out.println("Calories: ");
            			String Calories = sc.next();
                        System.out.println("Carbohydrates: ");
            			String Carbohydrates = sc.next();
                        System.out.println("Sugar: ");
           			String Sugar = sc.next();
                        System.out.println("Fiber: ");
            			String Fiber = sc.next();
                        System.out.println("Protein: ");
            			String Protein = sc.next();
                        System.out.println("Total Fat: ");
            			String totalFat = sc.next();
                                
                        System.out.println("Want to add another entry?\nEnter 1 to continue:\nOR\nEnter 0 to exit: ");
            
                        
                            sb.append(date);
                            sb.append(',');
                            sb.append(foodTime);
                            sb.append(',');
                            sb.append(foodItem);
                            sb.append(',');
                            sb.append(Calories);
                            sb.append(',');
                            sb.append(Carbohydrates);
                            sb.append(',');
                            sb.append(Sugar);
                            sb.append(',');
                            sb.append(Fiber);
                            sb.append(',');
                            sb.append(Protein);
                            sb.append(',');
                            sb.append(totalFat);
                            sb.append('\n');

            
			pw.write(sb.toString());
            		exit = sc.nextInt();
                        
        
		} 
                while (exit != 0);

                
		pw.close();
		sc.close();        
		System.out.println("Good Job your completed your Food Diary!");
    	}

}  
    
    
    
