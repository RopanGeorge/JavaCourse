package javaExercises;

import utils.Utils;

public class S2T2_ex2_Swap_A_with_B {
    public static void main(String[] args) {
        System.out.println("Introduceti valoarea lui A: ");
        int a = Utils.scanner().nextInt();
        System.out.println("Introduceti valoarea lui B: ");
        int b = Utils.scanner().nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A are valoarea: "+ a + ", iar B are valoarea: "+ b);

    }
}
