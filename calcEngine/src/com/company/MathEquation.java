package com.company;

public class MathEquation {

    private double leftVals;
    private double rightVals;
    private double results;
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

    public double getResults() {
        return results;
    }

    public void setOpCodes(char opCodes) {
        this.opCodes = opCodes;
    }

    public void execute() {
        switch (opCodes) {
            case 'a' :
                results= leftVals + rightVals;
                break;
            case 's' :
                results = leftVals - rightVals;
                break;
            case 'd' :
                results = rightVals > 0 ? leftVals/rightVals: 0;
                break;
            case 'm' :
                results = leftVals * rightVals;
                break;
            default:
                System.out.println("Error - invalid opCode");
                results = 0;
        }
    }


}
