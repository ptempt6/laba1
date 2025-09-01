package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComplexTest {
    private Complex a;
    private Complex b;

    @BeforeEach
    void createComplex() {
        a = new Complex(20.3, 15.15);
        b = new Complex(18.1, 19.2);
    }

    @Test
    void subtractTest() {
        Complex result = a.subtract(b);

        Assertions.assertEquals(20.3 - 18.1, result.getRe(), 0.00001);
        Assertions.assertEquals(15.15 - 19.2, result.getIm(), 0.00001);
        //Assertions.assertEquals(1,0);
    }

}
