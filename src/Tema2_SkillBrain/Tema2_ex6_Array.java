package Tema2_SkillBrain;

import utils.Utils;

public class Tema2_ex6_Array {
    public static void main(String[] args) {
        double[] numere=new double[]{2,3,4,5,6,7,8,34,2};

        for(int i=0;i< numere.length;i++)
        {
            if(i==7) return;
            if(i==2) continue;

            System.out.println("Index valid "+i);
        }

    }
}
