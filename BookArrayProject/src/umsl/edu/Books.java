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
public class Books 
{
    String bookName;
     String bookAuthorName;
     String bookGenre;
    
        public Books(String title, String author, String genre)
            {
                bookName = title;
                bookAuthorName = author;
                bookGenre = genre; 
            }
    
    public static void main(String[] args)
        {
           Books arr[] = new Books[3];
           arr[0] = new Books("Diary of a Wimpy Kid: The Last Straw", "Jeff Kinney", "Comedy");
           arr[1] = new Books("Percy Jackson and the Olympians: The Titan's Curse", "Rick Riordan", "Fantasy");
           arr[2] = new Books("Percy Jackson and the Olympians: The Last Olympian", "Rick Riordan", "Fantasy");
    
           for (int i =0; i<3; i++)
           {
               System.out.println("Title: " + arr[i].bookName);
               System.out.println("Author: " + arr[i].bookAuthorName);
               System.out.println("Genre: " + arr[i].bookGenre);
           }
        }
}
