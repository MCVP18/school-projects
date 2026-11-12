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
public class StiudentConstructor 
{
    public static void main(String[] args)
        {
            Student s = new Student("John Smith", "12/23/99", "18156922", "7.0", "2911 Laclede Ln" );
            
            
            System.out.println("Name" + s.getName() + "Date" + s.getDateOfBirth() + "ID" + s.getStudentID() + "GPA" + s.getGPA()+ "Address" + s.getAddress()); 
        }
 
}
