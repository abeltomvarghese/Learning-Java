package com.company.CalcEngine;

public class Adder extends CalcBase implements iMathProcessing{
    public Adder() {}
    public Adder(double leftVals, double rightVals) {
        super(leftVals, rightVals);
    }


    @Override
    public void calculate() {
        setResult(getLeftVals() + getRightVals());
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVals(leftVal);
        setRightVals(rightVal);
        calculate();
        return getResult();
    }
}
