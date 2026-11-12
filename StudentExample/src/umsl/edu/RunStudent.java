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
public class RunStudent 
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Clarence", 90, 70);
        System.out.println(s2.getName());
        System.out.println(s2.getExam1());
        s2.setName("CB");
        System.out.println(s2.getName());
        s2.setExam1(100);
        System.out.println(s2.getExam1());
        s2.calcAvg(.75, .25); 
        s2.print();
    }
            
}
