package com.company;

public class Divider extends CalcBase {
    public Divider(double leftVals, double rightVals) {
        super(leftVals, rightVals);
    }

    @Override
    public void calculate() {
        setResult(getLeftVals() / getRightVals());
    }
}
