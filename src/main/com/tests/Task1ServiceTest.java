package main.com.tests;


import main.com.services.Task1Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class Task1ServiceTest {
    Task1Service cut = new Task1Service();
    static List<Arguments> getLengthTestArgs() {
        return List.of(
                Arguments.arguments(72, 45, "degree", 40.77),
                Arguments.arguments(122, 0.96, "", 110)
        );
    }

    @ParameterizedTest
    @MethodSource("getLengthTestArgs")
    void getLengthTest(double speed, double angle, String radianOrDegree, double expected){
        double actual = cut.getLength(speed, angle, radianOrDegree);
        Assertions.assertEquals(expected, actual);
    }

    static List<Arguments> RoundTestArgs() {
        return List.of(
                Arguments.arguments(3.456, 2, 3.46),
                Arguments.arguments(-1.432, 1, -1.4)
        );
    }

    @ParameterizedTest
    @MethodSource("RoundTestArgs")
    void RoundTest(double value, int places, double expected){
        double actual = cut.round(value, places);
        Assertions.assertEquals(expected, actual);
    }

}
