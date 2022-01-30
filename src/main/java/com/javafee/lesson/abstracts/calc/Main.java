package com.javafee.lesson.abstracts.calc;

public class Main {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println(basicCalculator.calculate(basicCalculator.addition(), 2, 4));
        System.out.println(basicCalculator.calculate(basicCalculator.division(), 2, 4));
        System.out.println(basicCalculator.calculate(basicCalculator.subtraction(), 2, 4));
        System.out.println(basicCalculator.calculate(basicCalculator.multiplication(), 2, 4));
    }
}
