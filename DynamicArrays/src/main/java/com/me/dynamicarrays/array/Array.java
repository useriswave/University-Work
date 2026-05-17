package com.me.dynamicarrays.array;

import java.util.NoSuchElementException;

public class Array {
    private int[] list;
    private int count = 1;

    public Array() {
        this.list = new int[0];
    }

    public void add(int number) {
        int[] newList = new int[list.length+1];
        if(count == 1) {
        list = new int[1];
            list[0] = number;
        }
        else {
            for(int i = 0; i < count; i++) {
                if(i < list.length) {
                    newList[i] = list[i];
                }
                else {
                    newList[i] = number;
                }
            }
            list = newList;
        }
        count++;
    }

    public void remove(int number) {
        int[] newList = new int[list.length-1];
        int elementIndex = 0;
        for(int i = 0; i < count-1; i++) {
            if(list[i] != number) {
                newList[elementIndex] = list[i];
                elementIndex++;
            }
        }
        list = newList;
        count--;
    }

    public void removeByIndex(int index) {
        int[] newList = new int[list.length-1];
        int elementIndex = 0;
        for(int i = 0; i < count-1; i++) {
            if(i != index) {
                newList[elementIndex] = list[i];
                elementIndex++;
            }
        }
        list = newList;
        count--;
    }

    public void insert(int index, int number) {
        int[] newList = new int[list.length+1];
        int elementIndex = 0;
        for(int i = 0; i < count; i++) {
            if(i != index) {
                newList[i] = list[elementIndex];
                elementIndex++;
            }
            else {
                newList[i] = number;
            }
        }
        list = newList;
        count++;
    }

    public int get(int index) {
        return getElementAtIndex(index);
    }

    public void clear() {
        count = 1;
        list = new int[0];
    }

    public int getFirst() {
        return getElementAtIndex(0);
    }

    public int getLast() {
        return getElementAtIndex(list.length-1);
    }

    private int getElementAtIndex(int index) {
        if(list.length >= 1) {
            return list[index];
        }

        throw new NoSuchElementException();
    }

    public void sort() {
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = 0; j < list.length - 1 - i; j++) {
                if(list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (list.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        for (int e : list) {
            sb.append(e).append(", ");
        }

        String element = sb.toString();
        return "[" + element.substring(0, element.length()-2) + "]";
    }
}
