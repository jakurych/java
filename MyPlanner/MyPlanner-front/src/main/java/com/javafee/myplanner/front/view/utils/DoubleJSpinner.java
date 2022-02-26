package com.javafee.myplanner.front.view.utils;

import javax.swing.*;

public class DoubleJSpinner extends JSpinner {
    private SpinnerNumberModel model;

    public DoubleJSpinner(double value, double minimum, double maximum, double stepSize) {
        super();
        model = new SpinnerNumberModel(value, minimum, maximum, stepSize);
        this.setModel(model);
    }

    public Double getDouble() {
        return (Double) getValue();
    }
}
