package com.company;

public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " — является палиндромом");
            } else {
                System.out.println(s + " — не является палиндромом");
            }
        };
    }

    public static String reverseString (String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            int k = str.length() - i - 1;
            s += str.charAt(k);

        }
        return s;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}