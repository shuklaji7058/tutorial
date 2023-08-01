package com.anish;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Anish";
        {
            a = 100;
            System.out.println(a);
            name = "Ravi";
            System.out.println(name);
        }
    }
}
