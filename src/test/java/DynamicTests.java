import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTests {

    @TestFactory
    Collection<DynamicTest> dynamicTestCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test", ()->assertEquals(2,Math.addExact(1,1))),
                DynamicTest.dynamicTest("Multiply test", ()->assertEquals(2,Math.multiplyExact(2,1)))
        );
    }
}
