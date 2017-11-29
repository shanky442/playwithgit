package com.test.core;

import java.util.Scanner;

public class Test {
    static String super_reduced_string(String s){
        // Complete this function
        int length = s.length();
        char[] charArray = s.toCharArray();
        for(int i=0;i<length-1;i++) {
            if(charArray[i] == charArray[i+1]) {
                charArray[i] = Character.MIN_VALUE;
                charArray[i+1] = Character.MIN_VALUE;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
