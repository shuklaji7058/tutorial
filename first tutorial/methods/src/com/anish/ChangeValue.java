package com.anish;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {3,5,88,9,1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[3] = 88;
    }
}
