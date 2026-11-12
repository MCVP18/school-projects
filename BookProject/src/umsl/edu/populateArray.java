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
public class populateArray
{
    
    public static void main (String[] args)
    {
        
    }
    public static void populateArray() 
        {
            String[] airplanes = new String[4];
            airplanes [0] = "Boeing 777";
            airplanes [1] = "Boeing 747";
            airplanes [2] = "Airbus";
            airplanes [3] = "Cessna";
//            processArray(airplanes);

            System.out.println("Number of elements in my array is: " + airplanes.length);
        }

//    public static void processArray(String[] airplanes) 
//        {
//           for(String s:airplanes)
//            {
//                System.out.println(s);
//            }
//           for (int i=0; i<airplanes.length; i++)
//            {
//                System.out.println(airplanes[i]);
//            }
//        }
}
