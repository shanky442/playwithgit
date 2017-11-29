package com.test.core;


public class SelectionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {20,40,2,2,123,12,23,34,34};
        array = selectionSort(array);
        for(int i:array) {
            System.out.println(i);
        }

    }
    static int[] selectionSort(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        if(array.length>0) {
            maxIndex = array.length-1;
        }
        for(;minIndex<maxIndex;minIndex++) {
            int min = minimum(minIndex,maxIndex,array);
            if(min != minIndex) {
                swap(minIndex,min,array);
            }
            
        }
        return array;
    }
    
    
    static int minimum(int minIndex, int maxIndex, int[] array) {
        int min = array[minIndex];
        int minValueIndex = minIndex;
        while(minIndex<=maxIndex) {
            if(array[minIndex] < min) {
                min = array[minIndex];
                minValueIndex = minIndex;
            }
            minIndex++;
        }
        return minValueIndex;
    }
    
    static void swap(int currentIndex, int targetIndex, int[] array) {
        int temp = array[currentIndex];
        array[currentIndex] = array[targetIndex];
        array[targetIndex] = temp;
    }

}
