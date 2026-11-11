/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

/**
 *
 * @author New
 */
public class Student2 
{
private String name;
private int exam1;
private int exam2;
private double myAvg;
private char lg;

// public static void main(String[] args)
// {
// Student s = new Student();
// s.menu();
// }

/**
* @return the name
*/
public String getName()
{
return name;
}

/**
* @return the exam1
*/
public int getExam1()
{
return exam1;
}

/**
* @param exam1 the exam1 to set
*/
public void setExam1(int exam1)
{
this.exam1 = exam1;
}

/**
* @param name the name to set
*/
public void setName(String name)
{
this.name = name;
}



public void menu()
    {
        calcAvg();
        calcLetterGrade();
        displayStudent();
    }

public Student2()
    {
        name = "Jane Doe";
        exam1 = 75;
        exam2 = 75;
    }

public Student2(String name, int exam1, int exam2)
    {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }


public void displayStudent()
    {
        System.out.println("Student: " + getName());
        System.out.println("Exam1: " + getExam1());
        System.out.println("Exam2: " + exam2);
        System.out.println("Average: " + myAvg);
        System.out.println("Letter Grade: " + lg);
    }

public void calcAvg()
    {

        myAvg = (getExam1() + exam2)/2.0;

    }


public void calcLetterGrade()
    {

    if(myAvg>=90)
        {
            lg = 'A';
        }
    else if(myAvg >= 70)
        {
            lg = 'B';
        }
    else if(myAvg >= 50)
        {
            lg = 'C';
        }
    else if(myAvg >= 35)
        {
            lg = 'D';
        }
    else
        {
            lg = 'F';
        }

    // System.out.println("Enter another grade [-99 to quit]");
    // input = sc.nextInt();
    }


}
