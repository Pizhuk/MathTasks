package main.com.tests;


import main.com.services.Task4Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class Task4ServiceTest {
    Task4Service cut = new Task4Service();

    static List<Arguments> getZTestArgs() {
        return List.of(
                Arguments.arguments(4, "4.13311"),
                Arguments.arguments(1, "It's impossible")
        );
    }

    @ParameterizedTest
    @MethodSource("getZTestArgs")
    void getZTest(double x, String expected) {
        String actual = cut.getZ(x);
        Assertions.assertEquals(expected, actual);
    }
}
