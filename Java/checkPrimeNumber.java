package Java;

import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        checkIsNumberPrime(number);
    }

    public static void checkIsNumberPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number+ " is a prime number?: " +isPrime);
    }


}