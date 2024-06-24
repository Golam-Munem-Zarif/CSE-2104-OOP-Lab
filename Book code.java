

package com.mycompany.book;
public class Book {

    
    static String genre = "Historical";
    static int totalBooks = 0;

   
    String title;
    String Writer;
    int year;

    
    public Book(String title, String Writer, int year) {
        this.title = title;
        this.Writer = Writer;
        this.year = year;
        totalBooks++; 
    }

    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + Writer);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    
    public static void displayTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }

    public static void main(String[] args) {
        // Creating three Book objects
        Book book1 = new Book("Science Fiction", "Erewhon", 1872);
        Book book2 = new Book("Harry Potter","Philosopher's Stone", 1997);
        Book book3 = new Book("Ami Tpu", "Mohammad Jfor Iqbal", 2005);

      
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
        System.out.println();

        
        Book.displayTotalBooks();
    }
}



