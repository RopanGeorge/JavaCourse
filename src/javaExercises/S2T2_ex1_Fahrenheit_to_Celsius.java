package javaExercises;

import utils.Utils;

public class S2T2_ex1_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        System.out.println("Enter Fahrenheit temperature: ");
        //int f = Utils.scanner().nextInt();
        //Utils.scanner().nextInt();

        //Formula Conversie
        double celsius = (Utils.scanner().nextInt()-32)*5/9;
        System.out.println("Celsius: " + celsius);
    }
}
