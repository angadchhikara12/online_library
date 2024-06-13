package com.company;
import java.util.*;

/**<blockquote><pre>{@code
 * I made class named "Library" to code for library,
 * So, I won't make a messed up the whole program.
 * }</pre></blockquote>**/
class Library{
/**<blockquote><pre>{@code
 * I made 2 Arrays:
 *     1. ab: to show Available books.
 *     2. ib: to show Issued books.
 *     3. nb: to show New books
 * I converted them as a list,
 * So I can add and remove books from the sections
 * ===============================================
 * I made a int variable totalBooksAvailable to show total books that are available
}</pre></blockquote>**/
    String[] ab = new String[90];
    List <String> avaliableBooks = new ArrayList<String>(Arrays.asList(ab));
    String[] ib = new String[180];
    List <String> issuedBooks = new ArrayList<String>(Arrays.asList(ib));
    String[] nb = new String[90];
    List <String> newBooks = new ArrayList<String>(Arrays.asList(nb));

    int totalBooksAvailable = nb.length + ab.length;

    public void addBooks(String bookName){
        avaliableBooks.add(bookName);
    }
    public void issueBooks(String bookName){
        avaliableBooks.remove(bookName);
        issuedBooks.add(bookName);
        System.out.printf("Book Issued. Thanks for issuing the book %s from us! Have a great Day and enjoy reading %s\n", bookName, bookName);
    }
    public void returnBooks(String bookName){
        avaliableBooks.add(bookName);
        issuedBooks.remove(bookName);
        System.out.println("Book Returned. Thanks for returning the book! Have a great Day😊");
    }
    public void showAvailableBooks(){
        System.out.printf("Our Available books: %s\tBooks Available%b\nOur Issued Books: %s\t Books Issued: %b\n Try our new books: %s\t New Books: %b\n Total Books Available: %s", Arrays.toString(ab), ab.length, Arrays.toString(ib), ib.length, Arrays.toString(nb), nb.length, totalBooksAvailable);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        System.out.println("Hello, How can I help you?");
        String var = sc.next();

        if (var == "Add a book" || var == "Add a new book"){
            if (lib.nb.length>= 90){
                System.out.println("Sorry, we are full right now! Please come back later🥹");
            } else {
                System.out.print("Please enter the title of your book:    ");
                String bookName = sc.next();
                lib.addBooks(bookName);
                System.out.printf("All right, your book %s is added into our library! Have a great day😊");
            }
        } else if (var == "Issue a book") {
            if (lib.ib.length >= 180){
                System.out.println("Sorry, we are out of books! Please come back later");
            }
        }
    }
}
