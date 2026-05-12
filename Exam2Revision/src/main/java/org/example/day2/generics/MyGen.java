package org.example.day2.generics;

public class MyGen<T> {

    T data;

     void setData(T newData) {
        this.data = newData;
    }

    public void printData() {
        System.out.println("Data: " + data);
    }

    public T getData() {
        return data;
    }
}
