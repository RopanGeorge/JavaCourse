package Tema1_SkillBrain;

import utils.Utils;

public class Tema1_ex6 {
    public static void main(String[] args) {
        int x=1;
        String y="Arbitru";
        boolean z=true;

        Read2Variable();

    }
    public static void Read2Variable(){
        int a= Utils.scanner().nextInt();
        int b= Utils.scanner().nextInt();
        System.out.println("Cele 2 numere sunt: "+a+" si "+b);

    }
}
