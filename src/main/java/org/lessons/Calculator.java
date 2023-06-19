package org.lessons;

public class Calculator {

//costruttore




    //    metodi
    public float add(float num1, float num2){
        return num1 + num2;
    }
    public float subtract(float num1, float num2){
        return num1 - num2;
    }
    public float divide(float num1, float num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("non puoi dividere per 0!!");
        }
        return num1 / num2;
    }
    public float multiply(float num1, float num2){
        return num1 * num2;
    }

}
