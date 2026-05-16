package questions.q1.model;

import questions.q1.interfaces.Measurable;

public class Snack implements Measurable {

    private final String name;
    private final int calories;

    public Snack(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getMeasurableValue() {
        return calories;
    }

    @Override
    public String toString() {
        return "snack name: " + name + ", calories: " + calories;
    }
}
