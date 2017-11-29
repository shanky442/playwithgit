package com.test.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparePrac1 {
    public static void main(String[] args) {
        List<Colour> list = new ArrayList<Colour>();
        Colour c1 = new Colour();
        c1.setClourName("colour1");
        //c1.setCustomSortOrder("1");
        Colour c2 = new Colour();
        c2.setClourName("colour2");
        //c2.setCustomSortOrder("3");
        Colour c3 = new Colour();
        c3.setClourName("colour3");
        c3.setCustomSortOrder("2");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println("before sorting::");
        for(Colour c:list) {
            System.out.println(c.clourName);
        }
        
        Collections.sort(list,new Comparator<Colour>() {
            @Override
            public int compare(Colour o1, Colour o2) {
                if (o1.getCustomSortOrder() == null) {
                    return 1;
                }
                if (o2.getCustomSortOrder() == null) {
                    return -1;
                }
                return o1.getCustomSortOrder().compareTo(o2.getCustomSortOrder());
            }
        });
        System.out.println("after sorting::");
        for(Colour c:list) {
            System.out.println(c.clourName);
        }
    }
    
}
