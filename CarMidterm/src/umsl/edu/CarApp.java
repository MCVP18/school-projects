/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author New
 */

public class CarApp 
{
    public static void main (String[]args)
        {
            List<Car> list = new ArrayList<Car>();

            CarApp app = new CarApp();


             list.add(app.createCar("Honda", "2017", "Insight"));
             list.add(app.createCar("Toyota", "2015", "Camry"));
             list.add(app.createCar("Ford", "2019", "Explorer"));
             list.add(app.createCar("Audi", "2018", "Q8"));
             list.add(app.createCar("Nissan", "2019", "Rogue Sport"));

             app.printCar(list);
        }

    public Car createCar(String brand, String year, String model)
        {
            return new Car(brand, year, model);
        }
    
    public void printCar(List<Car> list)
        {
            for(Car c:list)
                {
                    System.out.println("Brand: " + c.getBrand());
                    System.out.println("Year: " + c.getYear());
                    System.out.println("Model: " + c.getModel());

                    System.out.println("======================");
                }
        }

}
