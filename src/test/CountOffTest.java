package test;

import com.thoughtworks.CountOffUtil;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOffTest {
    CountOffUtil util = new CountOffUtil();

    @org.junit.jupiter.api.Test
    void should_say_number_when_count_off_given_number_is_not_multiple_of_3_5_7() {
        assertEquals(util.countOfWith(2), "2");
    }

    @org.junit.jupiter.api.Test
    void should_say_Fizz_when_count_off_given_number_is_multiple_of_3() {
        assertEquals(util.countOfWith(3), "Fizz");
    }

    @org.junit.jupiter.api.Test
    void should_say_Buzz_when_count_off_given_number_is_multiple_of_5() {
        assertEquals(util.countOfWith(5), "Buzz");
    }

    @org.junit.jupiter.api.Test
    void should_say_Whizz_when_count_off_given_number_is_multiple_of_7() {
        assertEquals(util.countOfWith(7), "Whizz");
    }

    @org.junit.jupiter.api.Test
    void should_say_FizzBuzz_when_count_off_given_number_is_multiple_of_3_5() {
        assertEquals(util.countOfWith(15), "FizzBuzz");
    }

    @org.junit.jupiter.api.Test
    void should_say_BuzzWhizz_when_count_off_given_number_is_multiple_of_5_7() {
        assertEquals(util.countOfWith(35), "BuzzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_say_FizzWhizz_when_count_off_given_number_is_multiple_of_3_7() {
        assertEquals(util.countOfWith(21), "FizzWhizz");
    }

    @org.junit.jupiter.api.Test
    void should_say_FizzBuzzWhizz_when_count_off_given_number_is_multiple_of_3_5_7() {
        assertEquals(util.countOfWith(105), "FizzBuzzWhizz");
    }
}