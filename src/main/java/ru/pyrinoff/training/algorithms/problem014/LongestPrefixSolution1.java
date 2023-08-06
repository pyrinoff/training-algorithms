package ru.pyrinoff.training.algorithms.problem014;

//Straightforward solution, O(m*n)
public class LongestPrefixSolution1 implements ILongestPrefixSolution {

    @Override
    public String longestCommonPrefix(String[] inputStrings) {
        int symbols = 0;
        firstCycle:
        {
            for (int i = 0; i < inputStrings[0].length(); i++) {
                final char currentChar = inputStrings[0].charAt(i);
                for (int j = 1; j < inputStrings.length; j++) {
                    if (i >= inputStrings[j].length()) {
                        break firstCycle;
                    }
                    if (inputStrings[j].charAt(i) != currentChar) {
                        break firstCycle;
                    }
                }
                symbols++;
            }
        }
        return inputStrings[0].substring(0, symbols);
    }

    /*
    //Non optimized
    @Override
    public String longestCommonPrefix(String[] inputStrings) {
        StringBuffer stringBuffer = new StringBuffer("");
        firstCycle:
        {
            for (int i = 0; i < 200; i++) {
                if (i >= inputStrings[0].length()) {
                    System.out.println("1");
                    break;
                }
                final char currentChar = inputStrings[0].charAt(i);
                for (int j = 1; j < inputStrings.length; j++) {
                    if (i >= inputStrings[j].length()) {
                        break firstCycle;
                    }
                    if (inputStrings[j].charAt(i) != currentChar) {
                        break firstCycle;
                    }
                }
                stringBuffer.append(currentChar);
            }
        }
        return stringBuffer.toString();
    }*/

}
