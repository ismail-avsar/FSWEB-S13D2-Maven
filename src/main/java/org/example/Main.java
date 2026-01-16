package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Palindrom Testleri ===");
        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221));
        System.out.println("isPalindrome(707): " + isPalindrome(707));
        System.out.println("isPalindrome(11212): " + isPalindrome(11212));
        System.out.println("isPalindrome(121): " + isPalindrome(121));

        System.out.println("\n=== Mükemmel Sayı Testleri ===");
        System.out.println("isPerfectNumber(6): " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28): " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1): " + isPerfectNumber(-1));

        System.out.println("\n=== Sayıları Kelimelere Dökme Testleri ===");
        System.out.println("numberToWords(123): " + numberToWords(123));
        System.out.println("numberToWords(1010): " + numberToWords(1010));
        System.out.println("numberToWords(-12): " + numberToWords(-12));
        System.out.println("numberToWords(0): " + numberToWords(0));

    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);

        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }


        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;


        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);

            switch (digit) {
                case '0':
                    result.append("Zero");
                    break;
                case '1':
                    result.append("One");
                    break;
                case '2':
                    result.append("Two");
                    break;
                case '3':
                    result.append("Three");
                    break;
                case '4':
                    result.append("Four");
                    break;
                case '5':
                    result.append("Five");
                    break;
                case '6':
                    result.append("Six");
                    break;
                case '7':
                    result.append("Seven");
                    break;
                case '8':
                    result.append("Eight");
                    break;
                case '9':
                    result.append("Nine");
                    break;
            }

            if (i < numberStr.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();

    }


}
