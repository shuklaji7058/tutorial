package com.anish;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        arrays of primitives
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 14;
        arr[2] = 44;
        arr[3] = 54;
        arr[4] = 64;
        //[34,14,44,54,64]
        System.out.println(arr[3]);

        //input using for loops
//       for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//       }
//       System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//    }

//            for (int num : arr) { //for every element in array, print the element
//                System.out.print(num + " ");//here num represents element of the array
        //    }
//            System.out.println(arr[5]);//index out of bound error


//        arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Anish";
        System.out.println(Arrays.toString(str));
    }
    }





