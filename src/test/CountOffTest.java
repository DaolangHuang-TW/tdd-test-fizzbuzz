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


}