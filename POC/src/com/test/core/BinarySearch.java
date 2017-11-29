package com.test.core;


public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {12,13,14,34,312,1123,2323};
        int target = 34;
        int result = binary(array,target);
        int place = result+1;
        System.out.println("target is found at place num "+place);
    }

    private static int binary(int[] array, int target) {
        // TODO Auto-generated method stub
        int min = 0;
        int max = array.length-1;
        
        while(min<=max) {
            int centre = (min+max)/2;
            if(target == array[centre]) {
                return centre;
            } else if(target < array[centre]) {
                max = centre-1;
            } else {
                min = centre+1;
            }
        }
        return -1;
    }
    
}
