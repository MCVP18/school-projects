/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author New
 */
public class TextArrayReadWriteExample
{


    Account[] myAccounts = new Account[3];


    public static void main(String args[])
        {


            TextArrayReadWriteExample myTest = new TextArrayReadWriteExample();
            myTest.populateAccts();
            myTest.readSerializedArray(); //Uncomment this after you have written accounts
            //myTest.writeSerializedArray(); //Comment this out when you have uncommented out the readAcct() line above.
            myTest.showAccts();

        }


    public void writeSerializedArray()
        {
            
            try
                {
                    FileOutputStream fos = new FileOutputStream("SerAccounts.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    oos.writeObject(myAccounts);
                    oos.flush();
                    fos.close();
                }
          
            catch (IOException IOE)
                
                {
                    System.err.println(IOE.getMessage());
                }
        }

    public void readSerializedArray()
        {

            try
                {
                    FileInputStream fis = new FileInputStream("SerAccounts.txt");
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    myAccounts = (Account[])ois.readObject();
                    fis.close();
                }

            catch (Throwable e)

                {
                    System.err.println(e);
                }
        }


    public void showAccts()
        {

            for(int i = 0; i < 3; i++)
                {
                    System.out.println(myAccounts[i].getAcctNum() + " " + myAccounts[i].getBalance());
                }
        }

    public void populateAccts()
        {

            for(int i =0; i<3; i++)
                {
                    myAccounts[i] = new Account(100.00);
                    String s = Integer.toString(i);
                    myAccounts[i].setAcctNum(s);
                }

        }


}
