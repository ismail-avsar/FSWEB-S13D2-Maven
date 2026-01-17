package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Havlayan Köpek Testleri ===");
        System.out.println("shouldWakeUp(true, 1): " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp(false, 2): " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp(true, 8): " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp(true, -1): " + shouldWakeUp(true, -1));

        System.out.println("\n=== Yaş Tespiti Testleri ===");
        System.out.println("hasTeen(9, 99, 19): " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42): " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34): " + hasTeen(22, 23, 34));

        System.out.println("\n=== Oyuncu Kedi Testleri ===");
        System.out.println("isCatPlaying(true, 10): " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36): " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35): " + isCatPlaying(false, 35));

        System.out.println("\n=== Alan Hesaplama Testleri ===");
        System.out.println("area(5.0, 4.0): " + area(5.0, 4.0));
        System.out.println("area(-1.0, 4.0): " + area(-1.0, 4.0));
        System.out.println("area(5.0): " + area(5.0));
        System.out.println("area(-1): " + area(-1.0));

        System.out.println("\n=== Palindrom Testleri ===");
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

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (!barking) {
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 20) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
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

        for (int i = 1; i <= number / 2; i++) {
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
        String result = "";

        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);

            switch (digit) {
                case '0':
                    result += "Zero";
                    break;
                case '1':
                    result += "One";
                    break;
                case '2':
                    result += "Two";
                    break;
                case '3':
                    result += "Three";
                    break;
                case '4':
                    result += "Four";
                    break;
                case '5':
                    result += "Five";
                    break;
                case '6':
                    result += "Six";
                    break;
                case '7':
                    result += "Seven";
                    break;
                case '8':
                    result += "Eight";
                    break;
                case '9':
                    result += "Nine";
                    break;
            }

            if (i < numberStr.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}