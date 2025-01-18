package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class WatchMovie {
    public static String watchMovie() {
        String response ="";
        /* Your code goes here*/
        Scanner scanner = new Scanner(System.in);
        response += "Enter the movie ticket price: ";
        System.out.print(response);
        double price = scanner.nextDouble();
        response = "Enter the movie rating (1-5): ";
        System.out.print(response);
        int rating = scanner.nextInt();
        if (price >= 12 && rating == 5) {
            response = "I’m interested in watching the movie";
        } else {
            response = "I am not interested in watching the movie";
        }
        scanner.close();

        response += ("Enter the movie ticket price \n");
        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}
