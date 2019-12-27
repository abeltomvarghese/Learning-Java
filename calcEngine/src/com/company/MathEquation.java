package com.company;

public class MathEquation {

    private double leftVals;
    private double rightVals;
    private double result;
    private char opCodes;

    public MathEquation (char opcode) {
        this.opCodes = opcode;
    }

    public MathEquation (double rightVal, double leftVal,char opcode) {
        this(opcode);
        this.rightVals = rightVal;
        this.leftVals = leftVal;
    }
    public double getLeftVals() {
        return leftVals;
    }

    public double getRightVals() {
        return rightVals;
    }

    public char getOpCodes() {
        return opCodes;
    }

    public void setLeftVals(double leftVals) {
        this.leftVals = leftVals;
    }

    public void setRightVals(double rightVals) {
        this.rightVals = rightVals;
    }

    public double getResult() {
        return result;
    }

    public void setOpCodes(char opCodes) {
        this.opCodes = opCodes;
    }

    public void execute() {
        switch (opCodes) {
            case 'a' :
                result = leftVals + rightVals;
                break;
            case 's' :
                result = leftVals - rightVals;
                break;
            case 'd' :
                result = rightVals > 0 ? leftVals/rightVals: 0;
                break;
            case 'm' :
                result = leftVals * rightVals;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0;
        }
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVals = leftVal;
        this.rightVals = rightVal;
        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVals = leftVal;
        this.rightVals = rightVal;
        execute();
        result = (int) result;
    }
}
