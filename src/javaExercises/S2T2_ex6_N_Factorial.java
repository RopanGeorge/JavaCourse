package javaExercises;

import utils.Utils;

public class S2T2_ex6_N_Factorial {
    public static void main(String[] args) {
        System.out.print("Introduceti valoarea lui N:");
        int n = Utils.scanner().nextInt();
        int sum=1;
        for(int i=1;i<=n;i++)
            sum=sum*i;
        System.out.print("N="+ sum);
    }
}
