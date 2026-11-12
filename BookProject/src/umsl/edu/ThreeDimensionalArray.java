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
public class ThreeDimensionalArray 
{
    public static void main(String args [])
        {
            int arr[][][] = new int[2][3][4];
            int i, j, k, num = 1;

            for(i=0; i<2; i++)
                {
                    for (j=0; j<3; j++)
                        {
                            for (k=0; k<4; k++)
                                {
                                    arr[i][j][k]= num;
                                    num++;
                                }
                        }
                        
                }
            for(i=0; i<2; i++)
                {
                    for (j=0; j<3; j++)
                        {
                            for (k=0; k<4; k++)
                                {
                                    System.out.println("arr["+ i + "]["+ j +"]["+ k +"]=" + arr[i][j][k]+"\t");
                                }
                        } 
                    System.out.println();
                }
           System.out.println();
        }
    
}
