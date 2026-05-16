package questions.q1.main;

import questions.q1.model.Book;
import questions.q1.model.GenericBox;
import questions.q1.model.Snack;
import questions.q1.utils.GenericOperations;

public class Main {
    public static void main(String[] args) {
        GenericBox<Book> bookBox = new GenericBox<>();
        bookBox.add (new Book("CleanCode", 464));
        bookBox.add(new Book("JavaBasics", 250));
        bookBox.add(new Book("Algorithms", 700));

        GenericBox<Snack> snackBox = new GenericBox<>();
        snackBox.add(new Snack("KitKat", 399));
        snackBox.add(new Snack("Lays", 38));
        snackBox.add(new Snack("Maltesers", 102));

        GenericBox<Book> bookBox2 = new GenericBox<>();
        bookBox2.add (new Book("Whatever", 284));
        bookBox2.add(new Book("Lol", 4892));
        bookBox2.add(new Book("Book of legends", 2398));

        GenericBox<Snack> snackBox2 = new GenericBox<>();
//        snackBox2.add(new Snack("gskj", 84));
//        snackBox2.add(new Snack("igisujkrh", 749));
//        snackBox2.add(new Snack("sklrgjlsrg", 329));

        GenericBox<?>[][] boxes = {{bookBox, snackBox}, {bookBox2, snackBox2}};

        GenericOperations<?> operations = null;
        for(GenericBox<?>[] list : boxes) {
            for (GenericBox<?> genericBox : list) {
                operations = new GenericOperations<>(genericBox);
                operations.printGenericBox();
            }
        }

        GenericOperations<Snack> snackGenericOperations = new GenericOperations<>(snackBox);
        System.out.println("\n\n" + snackGenericOperations.getItemWithLargestValue());
    }
}
