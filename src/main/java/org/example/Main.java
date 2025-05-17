package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        StringCal cal = new StringCal();
        System.out.println(cal.stringCalculator(input));
    }


}