package javaExercises;

import utils.Utils;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Enter Fahrenheit temperature: ");

        //Formula conversie
        double fahrenheit = (Utils.scanner().nextInt()-32)*5/9;
        System.out.println("Celsius: " + fahrenheit);

    }
}
