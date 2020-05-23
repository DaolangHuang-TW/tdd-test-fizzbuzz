package com.thoughtworks;

public class CountOffUtil {
    public String countOfWith(int number) {
        String countOff = "";
        if (number %3 == 0) {
            countOff = "Fizz";
        }

        if (number %5 == 0) {
            countOff += "Buzz";
        }

        if (number %7 == 0) {
            countOff += "Whizz";
        }

        if (countOff.isEmpty()) {
            countOff = String.valueOf(number);
        }
        return countOff;
    }
}
