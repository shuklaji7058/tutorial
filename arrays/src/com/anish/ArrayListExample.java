package com.anish;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);


//        list.add(87);
//        list.add(871);
//        list.add(870);
//        list.add(874);
//        list.add(877);
//
//        list.add(876);
//
////        System.out.println(list.contains(877));
//
//        System.out.println(list);
//
//        list.set(0,99);
//
//        list.remove(2);
//
//        System.out.println(list);

//    input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

}
