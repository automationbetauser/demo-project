package com.math.operation;

public class ArithmeticOperations {

    public Integer add(Integer a, Integer b)
    {
        //add. 
        // addition of integers
        return a+b;
    }

    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

}
