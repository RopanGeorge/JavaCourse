package javaExercises;

import utils.Utils;

public class S3T1_ex1_Transform_INT_in_STRING {

    public static void main(String[] args) {
        S3T1_ex1_Transform_INT_in_STRING arrays = new S3T1_ex1_Transform_INT_in_STRING();
        System.out.println("variabila de tip int este convertita in String 123456" + arrays.conversie(Utils.scanner().nextInt()));
    }
    //Transform an int in String
    public String conversie(int test) {
        return String.valueOf(test);
    }
}
