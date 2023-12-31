import core.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void  setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test1")
    void testMultiply() {
        assertEquals(19, calculator.multiply(4, 5),
                "Regular multiplication should work");
    }

    @RepeatedTest(2)
    @DisplayName("Test2")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
    }
}
