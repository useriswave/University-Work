package questions.q1.utils;

import questions.q1.exceptions.BoxEmptyException;
import questions.q1.interfaces.Measurable;
import questions.q1.model.Book;
import questions.q1.model.GenericBox;
import questions.q1.model.Snack;

import java.util.ArrayList;

public class GenericOperations <T> {

    private GenericBox<T> box;
    public GenericOperations(GenericBox<T> box) {
        this.box = box;
    }

    public void printGenericBox() {
        for (T item : box.getItemsList()) {
            System.out.println(item);
        }
    }

    public T getItemWithLargestValue() {
        if (box.getItemsList().isEmpty())
            throw new BoxEmptyException("Cannot retrieve values of an empty box.");

        ArrayList<T> items = box.getItemsList();
        int largest = ((Measurable) items.getFirst()).getMeasurableValue();
        T largestItem = items.getFirst();

        for(int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Snack || items.get(i) instanceof Book) {
                if(((Measurable) items.get(i)).getMeasurableValue() > largest) {
                    largest = ((Measurable) items.get(i)).getMeasurableValue();
                    largestItem = items.get(i);
                }
            }
        }
        return largestItem;
    }

}
