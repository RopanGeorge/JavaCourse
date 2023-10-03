package Tema2_SkillBrain;

import utils.Utils;

public class Tema2_ex1 {
    public static void main(String[] args) {
        int x= Utils.scanner().nextInt();
        int randomint = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
        if(x > randomint)  System.out.println(x + " mai mare decat " + randomint); else
            System.out.println(x + " mai mic decat " + randomint);
    }
}
