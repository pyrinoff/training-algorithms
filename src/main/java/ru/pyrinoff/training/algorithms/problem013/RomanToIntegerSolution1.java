package ru.pyrinoff.training.algorithms.problem013;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Straightforward solution with worst complexity O(n^2).
public class RomanToIntegerSolution1 implements IRomanToIntegerSolution {

    final static Map<String, Integer> replaceMap = new HashMap<>() {{
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    @Override
    public int romanToInt(String inputString) {
        int number = 0;
        for (String key : replaceMap.keySet()) {
            while (inputString.contains(key)) {
                number += replaceMap.get(key);
                inputString = inputString.replaceFirst(key, "");
                System.out.println("Adding " + replaceMap.get(key));
            }
        }
        return number;
    }

}
