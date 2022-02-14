package com.javafee.lesson.mvc;

//hold all the data

public class CalculationModel {

    private double calculationValue;
    private double firstNumber;
    private double secendNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecendNumber(double secendNumber) {
        this.secendNumber = secendNumber;
    }

    public void addNumbers(double firstNumber, double secendNumber){

        calculationValue = firstNumber + secendNumber;

    }


    public double getCalculationValue() {
        return calculationValue;
    }
}
