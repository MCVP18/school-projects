/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author New
 */
public class TextArrayReadWriteExample
{


    Account myAccounts[] = new Account[3];


    public static void main(String args[])
        {

            TextArrayReadWriteExample myTest = new TextArrayReadWriteExample();
            myTest.populateAccts();
            //myTest.readAcct(); //Uncomment this after you have written accounts
            myTest.writeAcct(); //Comment this out when you have uncommented out the readAcct() line above.
            myTest.showAccts();

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



    public void readAcct()
    {

        try
        {

        BufferedReader br = new BufferedReader(new FileReader("accountINFO.txt"));
        int counter = 0;

        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null)

            {

            //System.out.println(sCurrentLine);
            StringTokenizer st = new StringTokenizer(sCurrentLine, "|");

            while(st.hasMoreTokens())

                {

                    for(int i = 0; i < 2; i++)

                        {

                            if(i == 0)

                                {

                                    String tempAcct = st.nextToken();
                                    myAccounts[counter].setAcctNum(tempAcct);

                                }

                            else

                                {

                                    myAccounts[counter].setBalance(Double.parseDouble(st.nextToken()));

                                }

                        }

                }

            counter++;

            }

        }

        catch (IOException e)

            {

                e.printStackTrace();

            }

    }



    public void writeAcct()
    {

        try

        {

        File file = new File("accountINFO.txt");

        // if file doesnt exists, then create it
            if (!file.exists())

                {
                    file.createNewFile();

                }


        FileWriter fw = new FileWriter(file, false); //change to true to append to the file
        BufferedWriter bw = new BufferedWriter(fw);


        for(int i = 0; i < myAccounts.length; i++)
            {


                String tempString = myAccounts[i].getAcctNum();
                double tempNumber = myAccounts[i].getBalance();
                String tempStringNum = Double.toString(tempNumber);
                bw.write(tempString);
                bw.write("|");
                bw.write(tempStringNum);
                bw.newLine();


            }

        System.out.println("Done");

        bw.close();


        }

        catch (IOException e)
            {
                e.printStackTrace();
            }

    }


}