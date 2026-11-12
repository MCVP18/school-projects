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
public class LearningConstructors
{
    public static void main (String[] args)
    {
        Car c = new Car("Honda", "Civic", 2); 
        //c.setName("Honda");
        //c.setNumberOfDoors(2);
        
        
        System.out.println("Make" + c.getMake() + "Name" + c.getName() + "Number of Doors" + c.getNumberOfDoors());
    }
}
