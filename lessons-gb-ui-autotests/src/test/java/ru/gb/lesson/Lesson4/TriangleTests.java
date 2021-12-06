package ru.gb.lesson.Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TriangleTests {


    public static Stream<Arguments> trianglesPerimeters() {
        return Stream.of(Arguments.of(new Triangle(3,4,5), 12),
                Arguments.of(new Triangle(3,3,3), 9),
                Arguments.of(new Triangle(3,4,6), 13));
    }

    @ParameterizedTest(name = ("Для {0} периметр равен {1}"))
    @MethodSource("trianglesPerimeters")

    void trianglePerimeterTest(Triangle triangle, int expectedResult){
        int actualResult = triangle.perimeterCalculating();
        Assertions.assertEquals(actualResult, expectedResult);
    }

}
