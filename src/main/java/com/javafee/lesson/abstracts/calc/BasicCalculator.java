package com.javafee.lesson.abstracts.calc;

public class BasicCalculator {

    public double calculate(Calculator calculator, double var1, double var2) {
        return calculator.calculate(var1, var2);
    }

    public Calculator addition() {
        return new Calculator() {
            @Override
            public double calculate(double var1, double var2) {
                return var1 + var2;
            }
        };
    }

    public Calculator subtraction() {
        return new Calculator() {
            @Override
            public double calculate(double var1, double var2) {
                return var1 - var2;
            }
        };
    }

    public Calculator multiplication() {
        return new Calculator() {
            @Override
            public double calculate(double var1, double var2) {
                return var1 * var2;
            }
        };
    }

    public Calculator division() {
        return new Calculator() {
            @Override
            public double calculate(double var1, double var2) {
                return var1 / var2;
            }
        };
    }
}
