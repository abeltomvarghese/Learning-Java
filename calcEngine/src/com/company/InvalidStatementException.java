package com.company;

public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement) {
        super(String.join(" ",reason,":",statement));

    }
    public InvalidStatementException(String reason, String statement, Throwable cause) {
        super(String.join(" ", reason, ":", statement),cause);
    }

}
