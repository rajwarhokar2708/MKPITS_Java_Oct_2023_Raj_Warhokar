package com.mkpits.enumpac;

import java.util.Scanner;

public class Solution {

    private static String[][] credentials = {
        {"user1", "pass1"},
        {"user2", "pass2"},
        {"user3", "pass3"},
        {"user4", "pass4"},
        {"user5", "pass5"}
    };

    public static void login(int noOfDigitsForThePalindrome, String userid, String password) {

        // Check for valid user
        boolean isValidUser = false;
        for (String[] credential : credentials) {
            if (credential[0].equals(userid) && credential[1].equals(password)) {
                isValidUser = true;
                break;
            }
        }

        // Generate token if valid user
        if (isValidUser) {
            int palindromeNumber = generatePalindromeNumber(noOfDigitsForThePalindrome);
            String tokenId = "token-" + palindromeNumber;
            System.out.println("Welcome " + userid + " and the generated token is: " + tokenId);
        } else {
            System.out.println("UserId or password is not valid, pls try again.");
        }

    }

    private static int generatePalindromeNumber(int noOfDigits) {
        int number = 1;
        while (Integer.toString(number).length() < noOfDigits) {
            number++;
        }
        while (!isPalindrome(number)) {
            number++;
        }
        return number;
    }

    private static boolean isPalindrome(int number) {
        int reversed = 0, remainder, original = number;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of digits for palindrome: ");
        int noOfDigits = scanner.nextInt();
        System.out.print("Enter userid: ");
        String userid = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        login(noOfDigits, userid, password);
    }
}