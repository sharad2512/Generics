package com.bridelabz.generics;
public class FindMaxFromMoreThanThree<T extends Comparable<T>> {  //sorting using comparable interface in collection generic class
    private T[] inputArray;
    FindMaxFromMoreThanThree(T[] inputArray){
        this.inputArray = inputArray;
    }
    public void  testMaximum() {
        for(int i=0; i<inputArray.length-1; i++) {
            if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
                inputArray[i+1] = inputArray[i];
            }
        }

    }
    private void toPrint() {
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public static void main(String[] args) {
        Integer[] integer = {15,32,45};
        String[] string = {"Peach","Banana","Apple"};
        Float[] floats = {15.1f,32.2f,45.3f};
        new FindMaxFromMoreThanThree(integer).testMaximum();
        new FindMaxFromMoreThanThree(string).testMaximum();
        new FindMaxFromMoreThanThree(floats).testMaximum();
        new FindMaxFromMoreThanThree(integer).toPrint();
        new FindMaxFromMoreThanThree(string).toPrint();
        new FindMaxFromMoreThanThree(floats).toPrint();
    }
}