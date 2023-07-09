package com.stringandarrays;

import java.util.*;

public class TwoListTotalElements {
    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(4,5,6,7,8);

        List<Integer> list=new ArrayList<>(list1);
        Set<Integer> set=new HashSet<>(list2);

        set.removeAll(list1);
        list.addAll(set);

        System.out.println(list);
    }
}
