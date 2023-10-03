package javaExercises;

import utils.Utils;

public class S3T1_ex2_PrintPrimeNumber {
    // Print Prime Number
    public static void main(String[] args) {
        int num = Utils.scanner().nextInt();
        S3T1_ex2_PrintPrimeNumber primeNumber = new S3T1_ex2_PrintPrimeNumber();
        primeNumber.isprimenumber(num);
    }

    public void displayPrimeNumberRange(int number) {
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public void isprimenumber(int prime) {
        // Display if keyboard input is prime or not
        int count = 0;
        for (int i = 1; i <= prime; i++) {
            if (prime % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Numarul este prim " + prime);
        } else {
            System.out.println("Numarul nu este prim");
        }
    }

}
