package com.test.core;


public class InsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {11,3,6,10,2,78,98,5,34};
        sortArray(array);
        for(int i:array) {
            System.out.println(i);
        }

    }
    
    public static void sortArray(int[] array) {
        int length = array.length;
        for(int i=1;i<length;i++) {
            int key = array[i];
            int j = i;
            while(j>0) {
                if(key<array[j-1]) {
                    shift(array,j,key);
                    j--;
                } else {
                    break;
                }                
            }
        }
    }
    
    public static void shift(int[] array, int j, int key) {
        array[j] = array[j-1];
        array[j-1] = key;
    }

}
