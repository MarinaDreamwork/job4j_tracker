package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to40then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(4, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40to160then12() {
        double expected = 12;
        Point a = new Point(4, 0);
        Point b = new Point(16, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when101to212Then1Point73() {
        double expected = 1.73;
        Point a = new Point(1, 0, 1);
        Point b = new Point(2, 1, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when478To245Then4Point69() {
        double expected = 4.69;
        Point a = new Point(4, 7, 8);
        Point b = new Point(2, 4, 5);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}