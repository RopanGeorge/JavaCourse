package javaExercises;

import utils.Utils;

public class S2T2_ex3_Odd_Even_Number {

    public static void main(String[] args) {
        System.out.println("Citim o valoare de la tastatura ");
        int a = Utils.scanner().nextInt();
        if (a%2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }
}
