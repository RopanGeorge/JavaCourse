package javaExercises;

import utils.Utils;

public class S2T2_ex4_Swap_A_with_B_with_3rd_var {
    public static void main(String[] args) {
        System.out.println("Introduceti valoarea lui A: ");
        int a = Utils.scanner().nextInt();
        System.out.println("Introduceti valoarea lui B: ");
        int b = Utils.scanner().nextInt();
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("A are valoarea: "+ a + ", iar B are valoarea: "+ b);

    }
}
