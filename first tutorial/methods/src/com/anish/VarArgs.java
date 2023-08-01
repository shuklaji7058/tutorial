package com.anish;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,6,5,67,88,99,44);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
