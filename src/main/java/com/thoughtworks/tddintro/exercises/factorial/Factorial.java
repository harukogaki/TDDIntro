package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        //Argument should not be negative
        if(i < 0){
            throw new IllegalArgumentException("Argument should be a positive integer!");
        }
        if (i == 0){
            return 1;
        }
        else {
            return i * compute(i - 1);
        }

    }
}
