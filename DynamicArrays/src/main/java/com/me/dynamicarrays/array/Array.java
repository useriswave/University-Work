package com.me.dynamicarrays.array;

public class Array {
    private int[] list;
    private int size = 1;
    private int count = 1;

    public Array() {
        this.list = new int[size];
    }

    public void insert(int number) {
        int[] newList = new int[list.length+1];
        if(count == 1) {
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
        int index = 0;
        for(int i = 0; i < count-1; i++) {
            if(list[i] != number) {
                newList[index] = list[i];
                index++;
            }
        }
        list = newList;
        count--;
    }

    @Override
    public String toString() {
        String element = "";
        for (int e : list) {
            element += (Integer.toString(e) + ", ");
        }
        return "[" + element.substring(0, element.length()-2) + "]";
    }
}
