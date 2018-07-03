package com.math.operation;

public class ArithmeticOperations {

    public Integer add(Integer a, Integer b)
    {
        //add.
        return a+b;
    }

    public Integer sub(Integer a, Integer b) {
        return a-b;
    }

    public Integer mul(Integer a, Integer b) {
        return a*b;
    }

    public Integer div(Integer a, Integer b) {
        if (b==0) {
            throw new IllegalArgumentException("Divisor cannot be 0.");
        }
        return a/b;
    }

    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
