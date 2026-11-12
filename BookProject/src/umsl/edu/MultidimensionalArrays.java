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
public class MultidimensionalArrays 
{
    public static void main(String[] args)
        {
            int[][] integers = new int[2][3];
            int k = 0;

            for (int i=0; i<=1; i++)
                {
                    for (int j =0; j<=2; j++)
                        {
                            integers[i][j]=k;
                            k++;
                        }

                }
            processArray(integers);
        }
    
    public static void processArray(int[][] integerArray)
        {
            System.out.println("Rows: " + integerArray.length);
            System.out.println("Columns: " + integerArray[0].length);
        }
}
