package test.algorithm.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import algorithm.utils.Pair;

public class PairTest {
    @Test
    public void test() {
        Pair<Integer, String> nullPair = new Pair<>();
        assertEquals(null, nullPair.first);
        assertEquals(null, nullPair.second);

        Pair<Integer, String> a = new Pair<>(10, "abc");
        Pair<Integer, String> b = new Pair<>(10, "abc");
        assertEquals(b, a);
        assertEquals(b.hashCode(), a.hashCode());

        Pair<Integer, String> c = new Pair<>(20, "def");
        assertNotEquals(c, a);
        assertNotEquals(c.hashCode(), a.hashCode());
    }
};
