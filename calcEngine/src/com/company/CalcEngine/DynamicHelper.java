package com.company.CalcEngine;

public class DynamicHelper {
    iMathProcessing[] handlers;

    public DynamicHelper(iMathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {
        String[] parts = statement.split(iMathProcessing.SEPARATOR);
        String keyword = parts[0];

        iMathProcessing theHandler = null;

        for(iMathProcessing handler:handlers) {
            if (keyword.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }




        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        double result = theHandler.doCalculation(leftVal, rightVal);

        return String.join(" ",Double.toString(leftVal),Character.toString(theHandler.getSymbol()),Double.toString(rightVal),"=",Double.toString(result));
    }
}
