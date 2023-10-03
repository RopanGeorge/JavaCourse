package javaExercises;

import utils.Utils;

public class S3T1_ex3_Armstrong_Number {
    public static void main(String[] args) {
        S3T1_ex3_Armstrong_Number Armstrong = new S3T1_ex3_Armstrong_Number();
        int x= Utils.scanner().nextInt();
        int temp=x;
        int contor=contorizarecifre(x);
        int[] cifre=new int[10];
        for(int i=0;i<contor;i++)
        {
            cifre[i]=temp%10;
            temp=temp/10;
        }
        CheckArmstrong( cifre, contor, x);
    }

    public static int contorizarecifre(int nr)
    {
        int nrcifre=0;
        while(nr>0){
            nr=nr/10;
            nrcifre++;
        }
        return nrcifre;
    }

    public static void CheckArmstrong(int[] array, int contor, int Armstrongnumber) {
        int sum=0;
        for(int i=0;i<contor;i++)
            sum= (int) (sum+ Math.pow(array[i],contor));
        if(Armstrongnumber==sum)
            System.out.println("Nr "+Armstrongnumber+" este Armstrong number");
        else
            System.out.println("Nr "+Armstrongnumber+" nu este Armstrong number");
    }
}

