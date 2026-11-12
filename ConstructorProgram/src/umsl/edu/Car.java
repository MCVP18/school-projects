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
public class Car 
{
    private String name;
    private String make;
    private int numberOfDoors;
    
   

    //Constructor
    public Car(String name, String make, int numberOfDoors)
        {
            this.name = name;
            this.make = make;
            this.numberOfDoors = numberOfDoors;
        }
    
    
    //Setters and Getters
    public String getName()
        {
            return name; 
        }
    public void setName(String name)
        {
            this.name = name;
        }
   
   public String getMake()
        {
            return make; 
        } 
    public void setMake(String make)
        {
            this.make = make;
        }
    
    public int getNumberOfDoors()
        {
            return numberOfDoors; 
        }
    public void setNumberOfDoors(int numberOfDoors)
        {
            this.numberOfDoors = numberOfDoors; 
        }
    
    
    
}
