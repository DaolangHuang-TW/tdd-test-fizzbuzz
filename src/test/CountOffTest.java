package test;

import com.thoughtworks.CountOffUtil;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOffTest {
    CountOffUtil util = new CountOffUtil();

    @org.junit.jupiter.api.Test
    void should_say_number_when_count_off_given_nmber_is_not_multiple_of_3_5_7() {
        assertEquals(util.countOfWith(2), "2");
    }
}