package com.anish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("a red sweet fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("a small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
                break;
        }
    }

}
