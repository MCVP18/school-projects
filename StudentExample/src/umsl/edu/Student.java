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
public class Student 
{
    private String name;
    private int exam1;
    private int exam2;
    private double avg; 

    public Student()
    {
        name = "Jane Doe";
        exam1 = 75;
        exam2 = 75;
    }
    
    public Student(String name, int exam1, int exam2)
    {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2; 
    }
    
    public Student(String arg_name)
    {
        name = arg_name;
    }

    public void setExam1(int ex1)
    {
        exam1 = ex1;
    }
    
    public int getExam1()
    {
        return exam1; 
    }
    public int getExam2()
    {
        return exam2;
    }

    
    
    public String getName() 
    {
        return name;
    }

   
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void calcAvg()
    {
        avg = (double)(exam1 + exam2)/2;
    }
    
    public void calcAvg(double w1, double w2)
    {
        avg = (double)((exam1 * w1)+(exam2 * w2));
    }
    
    
    
    public void print()
    {
        System.out.println("Name:" + getName());
        System.out.println("Exam1:" + getExam1());
        System.out.println("Exam2:" + getExam2());
        System.out.println("Average:" + getAvg());

    }

    /**
     * @return the avg
     */
    public double getAvg() {
        return avg;
    }
}
