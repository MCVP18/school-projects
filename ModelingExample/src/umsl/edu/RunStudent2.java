/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author New
 */
public class RunStudent2
{
Student2[] myStudents = new Student2[3];

public static void main(String[] args)
{
RunStudent2 rs2 = new RunStudent2();
rs2.menu();
}

public void menu()
{
Scanner sc = new Scanner(System.in);
int input;
do
{
System.out.println("1) Populate Students");
System.out.println("2) Select Students");
System.out.println("3) Show Students");
System.out.println("4) Exit");
input = Integer.parseInt(sc.next());
    switch (input) 
    {
        case 1:
            populateStudents();
            break;
        case 2:
            selectStudents();
            break;
        case 3:
            showStudents();
            break;
        default:
            break;
    }
}
while(input != 4);

}


public void selectStudents()
{
String tempName;
int index = -99;
for(int i = 0; i < myStudents.length; i++)
{
System.out.println("Enter name to find:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//Scanner sc = new Scanner(System.in);
try
{
tempName = br.readLine();
}
catch(IOException ioe)
{
System.out.println("Something went wrong with your input name try again");
i=-1;
continue;
}

if(myStudents[i].getName().equalsIgnoreCase(tempName))
{
index = i;
break;
}
}
if(index != -99)
{
myStudents[index].menu();
}
else
{
System.out.println("Student not found, please try again.");
}
}

public void populateStudents()
{
String tempname;
int tempex1;
int tempex2;

Scanner sc = new Scanner(System.in);


for(int i = 0; i < myStudents.length; i++)
{
if(myStudents[i] == null)
{
System.out.println("Please enter your name: ");
tempname = sc.next();
System.out.println("Please enter your exam1 score: ");
tempex1 = Integer.parseInt(sc.next());
System.out.println("Please enter your exam2 score: ");
tempex2 = Integer.parseInt(sc.next());

myStudents[i] = new Student2(tempname,tempex1, tempex2);
break;
}
}



// for(int i = 0; i < myStudents.length; i++)
// {
// System.out.println("Please enter your name: ");
// tempname = sc.next();
// System.out.println("Please enter your exam1 score: ");
// tempex1 = Integer.parseInt(sc.next());
// System.out.println("Please enter your exam2 score: ");
// tempex2 = Integer.parseInt(sc.next());
//
// myStudents[i] = new Student(tempname,tempex1, tempex2);
// myStudents[i].calcAvg();
// myStudents[i].calcLetterGrade();
// }
}


public void showStudents()
    {
        for(int i = 0; i < myStudents.length; i++)
        {
            myStudents[i].displayStudent();
            break;
        }
    }


}

 
