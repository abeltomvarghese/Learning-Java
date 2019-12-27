package com.company;

public class Subtracter extends CalcBase{
    public Subtracter(double leftVals, double rightVals) {
        super(leftVals, rightVals);
    }

    @Override
    public void calculate() {
        setResult(getLeftVals() - getRightVals());
    }
}
