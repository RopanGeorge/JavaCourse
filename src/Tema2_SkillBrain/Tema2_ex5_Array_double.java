package Tema2_SkillBrain;

import utils.Utils;

public class Tema2_ex5_Array_double {
    public static void main(String[] args) {
        double[] numere=new double[10];
        for(int i=0;i< numere.length;i++)
        {
            numere[i]=Utils.scanner().nextDouble();

            if(numere[i]==4.5) System.out.println(numere[i]);
            if(numere[i]>5) System.out.println("Numar peste 5");

        }

    }
}
