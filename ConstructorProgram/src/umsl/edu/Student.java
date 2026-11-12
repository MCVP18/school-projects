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
    private String dateOfBirth;
    private String studentID;
    private int gpa;
    private String address;
    
    
    public Student (String name, String birth, String ID, int gpa, String address)
        {
            this.name = name;
            this.dateOfBirth = birth;
            this.studentID = ID;
            this.gpa = gpa; 
            this.address = address;
        }
    
    
    public String getName()
        {
            return name; 
        }
    
    public String getDateOfBirth()
        {
            return dateOfBirth; 
        }
   
   public String getStudentID()
        {
            return studentID; 
        } 
    
    public int getGPA()
        {
            return gpa; 
        }
   public String getAddress()
        {
            return address; 
        }
}
