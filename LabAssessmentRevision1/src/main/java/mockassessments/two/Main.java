package mockassessments.two;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var b1 = new Book("Whatever", "John", 30);
        var b2 = new Book("Lol", "Jerry", 50);

        var books = new ArrayList<Book>();
        books.add(b1); books.add(b2);

        Book largestBook = books.getFirst();
        for(Book b : books) {
            System.out.println(b);
            if(b.getPages() > largestBook.getPages()) {
                largestBook = b;
            }
        }
        System.out.println("Book with largest amount of pages: " + largestBook);
    }
}
