package main.com.tests;

import main.com.services.Task2Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2ServiceTest {
    Task2Service cut = new Task2Service();

    @Test
    void getDistanceTest(){
        double actual = cut.getDistance(50, 60, 10, 1.5);
        double expected = 175;
        Assertions.assertEquals(actual, expected);
    }
}
