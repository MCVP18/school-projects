/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author New
 */
public class FoodItem 
{
    public static void main(String args[])
	{
		try
		{
                    Scanner sc = new Scanner(System.in);
                    int id;
                    int calories;
                    String foodItem;

                    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://D:/food.xlsx");
                    Statement statement = conn.createStatement();
                    statement.executeUpdate("create table FoodItem (ID number, Name varchar(30), Calories number)");
                    System.out.println("Tablehas been created. ");

                    System.out.print("Enter Food Item ID: ");
                        id = sc.nextInt();
                    System.out.print("Enter Food Item: ");
                        foodItem = sc.next();
                    System.out.print("Enter Calories: ");
                        calories = sc.nextInt();

                    statement.executeUpdate("insert into FoodItem values('" + id + "','" + foodItem + "'),'" + calories + "'");
                    System.out.println("Food iteam has been recorded. ");

                    ResultSet rs = statement.executeQuery("select * from FoodItem");

			while(rs.next())
			{
                            System.out.println("ID : " + rs.getInt("ID"));
                            System.out.println("Food Item : " + rs.getString("Food Item"));
                            System.out.println("Calories : " + rs.getInt("Calories"));
			}
                        
			rs.close();
			statement.close();
			conn.close();
		}

		catch(Exception e1)
		{
                    System.out.println("Exception is " + e1);
		}
        }
}
