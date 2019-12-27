package com.company;

public class Adder extends CalcBase {
    public Adder(double leftVals, double rightVals) {
        super(leftVals, rightVals);
    }

    @Override
    public void calculate() {
        setResult(getLeftVals() + getRightVals());
    }
}
