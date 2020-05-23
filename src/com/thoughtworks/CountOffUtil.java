package com.thoughtworks;

public class CountOffUtil {
    public String countOfWith(int number) {
        String countOff = "";
        if (number %3 == 0) {
            countOff = "Fizz";
        }

        if (countOff.isEmpty()) {
            countOff = String.valueOf(number);
        }
        return countOff;
    }
}
