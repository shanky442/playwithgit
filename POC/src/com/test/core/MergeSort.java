package com.test.core;


public class MergeSort {
    static int length;
    static int[] helper;
    static int[] numbers;
    public static void main(String[] args) {
        int[] array = {12,23,1,2,3};
        
        sort(array);
        for(int i:numbers) {
            System.out.println(i);
        }
       
    }
    
    public static void sort(int[] array) {
        numbers = array;
        length = array.length;
        helper = new int[length];
        mergeSort(0, length-1);
    }
    
    public static void mergeSort(int low, int high) {
        if(low<high) {
            int mid = low + (high - low)/2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low,mid,high);
        }
    }
    
    public static void merge(int low, int mid, int high) {
        for(int i=low;i<=high;i++) {
            helper[i] = numbers[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while(i<=mid && j<=high) {
            if(helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;            
        }
        
        while (i <= mid) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }
    
}
