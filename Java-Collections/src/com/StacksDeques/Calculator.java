package com.StacksDeques;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {

    public int evaluate(final String input) {
        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");

        for (String token : tokens) {
            stack.push(token);
        }

        int result = 0;

        while (stack.size() > 1) {
            final int left = Integer.parseInt(stack.pop());
            final String operator = (String) stack.pop();
            final int right = Integer.parseInt(stack.pop());

            switch(operator) {
                case "+" :
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                case "/":
                    result = left / right;
                    break;
            }

            stack.push(String.valueOf(result));
        }
        return Integer.parseInt(stack.pop());
    }


}
