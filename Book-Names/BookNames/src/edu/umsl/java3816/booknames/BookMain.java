package edu.umsl.java3816.booknames;

public class BookMain extends Books implements bookName,bookAuthorName,bookGenre {
	
public static void main(String[] args) {
		
		bks.Books();
        bk1.AssignBook1Values();
        bk2.AssignBook2Values();
        bk3.AssignBook3Values();
        String[] book = new String[9];
        book[0] = bk1.bookName;
        book[1] = bk1.bookAuthorName;
        book[2] = bk1.bookGenre;
        book[3] = bk2.bookName;
        book[4] = bk2.bookAuthorName;
        book[5] = bk2.bookGenre;
        book[6] = bk3.bookName;
        book[7] = bk3.bookAuthorName;
        book[8] = bk3.bookGenre;
        
        System.out.println();
        System.out.println("The books in this project are: ");
        System.out.println();
        
        for(int i=0;i<=2;i++) {
        	System.out.println(book[i]);
        }
        System.out.println();
        for(int j=3;j<=5;j++) {
        	System.out.println(book[j]);
        }
        System.out.println();
        for(int k=6;k<=8;k++) {
        	System.out.println(book[k]);
        }
        
}

}
		
