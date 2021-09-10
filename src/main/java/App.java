import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Long> numberList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            numberList.add(reader.nextLong());
            System.out.print("Enter the second number: ");
            numberList.add(reader.nextLong());
            System.out.print("Enter the third number: ");
            numberList.add(reader.nextLong());

            long max = Long.MIN_VALUE;
            for (long number : numberList) {
                if (number > max) {
                    max = number;
                }
            }

            System.out.println("The largest number is " + max + ".");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
