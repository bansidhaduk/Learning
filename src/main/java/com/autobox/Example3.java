package com.autobox;
import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100); // autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        for(Integer i : arrayList) {
            System.out.println(i);
        }

        // unboxing Integer to int type
        int first = arrayList.get(0);
        System.out.println("int value "+first);
    }
}
