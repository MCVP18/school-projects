/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author New
 */
public class ZipCode      
{
    public static void main (String[] args)
    {
        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(60606, "Chicago");
        hm.put(63121, "St. Louis");
        hm.put(10001, "New York City"); 
        
        for(Map.Entry<Integer,String> entry : hm.entrySet())
        {
              System.out.println(entry.getKey() + " for " + entry.getValue());
        }
  
        System.out.println("But do yout really want to go to these cities");
        System.out.println("You can go to Los Angelas, Alanta, Houston, THE POSSIBILITIES ARE ENDLESS");
    }
}
