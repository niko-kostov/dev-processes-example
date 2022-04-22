package tdd.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void addNullReturnsNullPointerException() {
        // Given
        Integer number1 = 10;
        Integer number2 = null;

        // When
        // Then
        assertThrows(
                NullPointerException.class,
                () -> calculator.add(number1, number2)
        );
    }

    @Test
    void addTwoIntegerNumbersReturnsCorrectValue() {
        // Given
        Integer number1 = 20;
        Integer number2 = 10;

        // When
        // Then
        assertEquals(
                30,
                calculator.add(number1, number2)
        );
    }
}
