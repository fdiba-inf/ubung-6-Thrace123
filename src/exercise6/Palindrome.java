package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int number1 = input.nextInt();
        assert number1 > 0;
        int palindrome = 0;
        int number2 = number1;

        while (number2 > 0) {
          int a = number2 % 10;
          number2 = (number2 - a) / 10;
          palindrome *= 10;
          palindrome = palindrome + a; 
        }

        boolean antwort = false;
        if (palindrome == number) {
          palindrome = true;
        }

        System.out.println("Die Nummer ist Palindrome: " + antwort);
    }
}
    

