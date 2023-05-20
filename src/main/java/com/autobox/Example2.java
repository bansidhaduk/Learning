package com.autobox;
import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            list.add(i);  //int values is converted to Integer
        }

        System.out.println(list);

        char c = 'a'; //assigning an char to Character object
        Character ch = c;
        System.out.println(ch);
    }
}
