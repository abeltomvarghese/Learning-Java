package com.company.CalcEngine;

public class Multiplier extends CalcBase{
    public Multiplier(double leftVals, double rightVals) {
        super(leftVals, rightVals);
    }

    @Override
    public void calculate() {
        setResult(getLeftVals() * getRightVals());
    }
}
