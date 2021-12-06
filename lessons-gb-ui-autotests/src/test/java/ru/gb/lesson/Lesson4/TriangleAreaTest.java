package ru.gb.lesson.Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleAreaTest {

    public static Stream<Arguments> trianglesAreas() {
        return Stream.of(Arguments.of(new Triangle(3,4,5), 6),
                Arguments.of(new Triangle(3,3,3), 3.897114317029974),
                Arguments.of(new Triangle(3,4,6), 5.332682251925386));
    }

    @ParameterizedTest(name = ("Для {0} площадь равна {1}"))
    @MethodSource("trianglesAreas")

    void triangleAreaTest(Triangle triangle, double expectedResult){
        double actualResult = triangle.triangleAreaCalculation(triangle);
        assertThat(actualResult).isEqualTo(expectedResult);
        //Assertions.assertEquals(actualResult, expectedResult);
    }
}
