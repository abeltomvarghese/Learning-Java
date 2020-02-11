package com.company;

public class WordWrap {

    public static String wrap(final String inputLine, final int linelength) {
        
        final StringBuilder accumulator = new StringBuilder();

        final int stringLength = inputLine.length();
        accumulator.append(inputLine, 0, Math.min(stringLength, linelength));

        int split = linelength;

        while (stringLength > split) {
            accumulator.append("\n");
            accumulator.append(inputLine, split, Math.min(split+linelength,stringLength));
            split += linelength;
        }


        /*

        if (stringLength > split) {
            accumulator.append("\n");
            accumulator.append(inputLine, split, split+linelength);
        }
        split+= linelength;
        if (stringLength > split) {
            accumulator.append("\n");
            accumulator.append(inputLine, split, stringLength);
        }


         */
        return accumulator.toString();
    }
}
