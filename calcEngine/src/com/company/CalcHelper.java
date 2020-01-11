package com.company;

import org.jetbrains.annotations.NotNull;

public class CalcHelper {
    MathCommands command = null;
    double rightVal;
    double leftVal;
    double result;
    public void process(@NotNull String statement) {
        String[] mathEquation = statement.split(" ");
        String operator = mathEquation[0];
        leftVal = Double.parseDouble(mathEquation[1]);
        rightVal = Double.parseDouble(mathEquation[2]);
        setCommandString(operator);

        CalcBase calcBase = null;

        switch (command) {
            case Add:
                calcBase = new Adder(leftVal, rightVal);
                break;
            case Divide:
                calcBase = new Divider(leftVal, rightVal);
                break;
            case Multiply:
                calcBase = new Multiplier(leftVal, rightVal);
                break;
            case Subtract:
                calcBase = new Subtracter(leftVal, rightVal);
                break;
        }
        calcBase.calculate();
        result = calcBase.getResult();
    }

    private void setCommandString(String commandString) {
        if (commandString.equalsIgnoreCase(MathCommands.Add.toString())) {
            command = MathCommands.Add;
        } else if (commandString.equalsIgnoreCase(MathCommands.Subtract.toString())) {
            command = MathCommands.Subtract;
        } else if (commandString.equalsIgnoreCase(MathCommands.Divide.toString())) {
            command = MathCommands.Divide;
        } else if (commandString.equalsIgnoreCase(MathCommands.Multiply.toString())) {
            command = MathCommands.Multiply;
        }
    }

    @Override
    public String toString() {
        String operater = null;
        switch (command) {
            case Subtract:
                operater = "-";
                break;
            case Add:
                operater = "+";
                break;
            case Multiply:
                operater = "*";
                break;
            case Divide:
                operater = "/";
                break;
        }
        return String.join(" ",Double.toString(rightVal),operater,Double.toString(leftVal),"=",Double.toString(result));
    }
}
