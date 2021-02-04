
package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);

        Dollar product = five.times(2);
        //assertEquals(10, product.amount); when amount was public
        assertEquals(new Dollar(10), product);

        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualitFranc() {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);

        Franc product = five.times(2);
        //assertEquals(10, product.amount); when amount was public
        assertEquals(new Franc(10), product);

        product = five.times(3);
        assertEquals(new Franc(15), product);
    }
}