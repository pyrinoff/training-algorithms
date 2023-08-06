package ru.pyrinoff.training.algorithms.problem013;

import java.util.HashMap;
import java.util.Map;

//GTP give an advice and I modify algorithm. Complexity O(n)
public class RomanToIntegerSolution2 implements IRomanToIntegerSolution {

    final static Map<Character, Integer> romanIntegers = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    @Override
    public int romanToInt(String inputString) {
        int length = inputString.length();
        int converted = 0;
        for (int i = 0; i < length; i++) {
            final int firstInt = romanIntegers.get(inputString.charAt(i));
            final int secondInt = i+1 < length ? romanIntegers.get(inputString.charAt(i+1)) : 0;
            if(secondInt > firstInt) {
                converted += secondInt - firstInt;
                i++;
            }
            else converted += firstInt;
        }
        return converted;
    }

}
