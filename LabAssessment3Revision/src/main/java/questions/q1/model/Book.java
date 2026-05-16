package questions.q1.model;

import questions.q1.interfaces.Measurable;

public class Book implements Measurable {

    private final String title;
    private final int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getMeasurableValue() {
        return pages;
    }

    @Override
    public String toString() {
        return "book title: " + title + ", pages: " + pages;
    }
}
