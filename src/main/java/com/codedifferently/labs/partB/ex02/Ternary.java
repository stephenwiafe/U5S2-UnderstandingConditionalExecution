package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
        int a = 20;
        int b;

        b = (a == 1) ? 90 : 90;
        response += "Value of y is: " + b + "\n";

        b = (a == 20) ? 61 : 90;
        response += "Value of y is: " + b + "\n";


        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
