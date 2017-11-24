package com.kodilla;

public class Calculator {

    int a = 0;
    int b = 0;

    //public void someMethod() {

        //System.out.println("Oh my God it's alive!!!");

    //}

    public int addition(int a, int b){

        return a+b;
    }

    public int substraction(int a, int b){

        return a-b;
    }


    public static void main (String args[]){

        Calculator calculator = new Calculator();
        //calculator.someMethod();
        int result1 = calculator.addition(5,6);
        System.out.println(result1);
        int result2 = calculator.substraction(5,6);
        System.out.println(result2);

    }
}
