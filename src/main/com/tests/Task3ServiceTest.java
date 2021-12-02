package main.com.tests;

import main.com.services.Task3Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class Task3ServiceTest {
    Task3Service cut = new Task3Service();

    static List<Arguments> doesPointBelongTestArgs() {
        return List.of(
                Arguments.arguments(2, 2, 1),
                Arguments.arguments(0, 2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("doesPointBelongTestArgs")
    void doesPointBelongTest(double x, double y, int expected) {
        double actual = cut.doesPointBelong(x,y);
        Assertions.assertEquals(expected, actual);
    }
}