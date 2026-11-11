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
public class Gender 
{
	public static void main(String[] args)
	{
		String gender = null;
		System.out.println("Please enter your Gender");
		Scanner sc = new Scanner(System.in); 


		if (gender.equalsIgnoreCase("Female"))
		{
			System.out.println("7");
		}
		else if(gender.equalsIgnoreCase("Male"))
		{
                    System.out.println("5");
		}
		else
		{ 
                    System.out.println("10"); 
		}
	}
 }


