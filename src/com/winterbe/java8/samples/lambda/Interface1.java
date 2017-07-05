package com.winterbe.java8.samples.lambda;

/**
 * @author Benjamin Winterberg
 */
public class Interface1 {

    interface Formula {
        double calculate(int input);

        default double sqrt(int input) {
            return Math.sqrt(input);
        }
    }

    public static void main(String[] args) {
        Formula formula1 = new Formula() {
            @Override
            public double calculate(int input) {
                return sqrt(input * 100);
            }
        };

        int input = 4;
        System.out.println(formula1.calculate(input));    // 20.0
        System.out.println(formula1.sqrt(input));         // 2.0

    }
}