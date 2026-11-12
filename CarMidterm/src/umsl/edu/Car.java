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
    String brand;
    String year;
    String model;
    
   //Constructor
   public Car(String brand, String year, String model) 
        {
            this.brand = brand;
            this.year = year;
            this.model = model;
        }
        
     
    //Setters and Getters
    public String getBrand()
        {
            return brand; 
        }
    public void setBrand(String brand)
        {
            this.brand = brand;
        }
   
   public String getYear()
        {
            return year; 
        } 
    public void setYear(String year)
        {
            this.year = year;
        }
    
    public String getModel()
        {
            return model; 
        }
    public void setModel(String model)
        {
            this.model = model; 
        }
}
