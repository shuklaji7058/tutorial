package com.anish;

public class StringExample {
    public static void main(String[] args) {
//        String message =  greet();
//        System.out.println(message);
        
         String personalized = myGreet("Anish shukla");
         System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;

    }


    static String greet(){
        String greeting = "how  are you";
        return greeting;
    }
}
