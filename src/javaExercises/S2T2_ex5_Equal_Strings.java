package javaExercises;

import utils.Utils;

public class S2T2_ex5_Equal_Strings {
    public static void main(String[] args) {
        System.out.print("String1-> ");
        String Sir1 = Utils.scanner().nextLine();
        System.out.print("Strin2-> ");
        String Sir2 = Utils.scanner().nextLine();
        if (Sir1.equals(Sir2)) {
            System.out.println("Stringurile sunt egale.");
        } else {
            System.out.println("Stringurile nu sunt egale.");
        }
    }
    //OBS! - The nextLine() method returns all text up to a line break.
    // The next() method returns tokenized text.
    // The next() method uses whitespace as the default delimiter.
}
