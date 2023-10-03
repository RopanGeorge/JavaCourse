package Tema2_SkillBrain;

import utils.Utils;

public class Tema2_ex2_SwitchCase {
    public static int Switch(String litera,int x, int y){
        switch (litera) {
            case "a":
                return x+y;
            case "s":
                return x-y;
            case "i":
                return x*y;
            case "p":
                return x/y;
            case "m":
                return x%y;
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        int x=Utils.scanner().nextInt();
        int y=Utils.scanner().nextInt();
        String litera=Utils.scanner().nextLine();
        System.out.println(Switch(litera,x,y));



    }


}
