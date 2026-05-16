package questions.q1.model;

import questions.q1.exceptions.BoxFullException;

import java.util.ArrayList;

public class GenericBox <T> {
    private final ArrayList<T> items;
    private final int CAP = 3;

    public GenericBox() {
        this.items = new ArrayList<T>();
    }

    public void add(T item) {
        if (items.size() == CAP)
            throw new BoxFullException();

        this.items.add(item);
    }

    public T getItem(int indexToGet) {
        if (indexToGet > CAP)
            throw new ArrayIndexOutOfBoundsException("Cannot access item beyond the array's capacity.");

        return items.get(indexToGet);
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean isBoxFull() {
        return items.size() == CAP;
    }

    public ArrayList<T> getItemsList() {
        return items;
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
