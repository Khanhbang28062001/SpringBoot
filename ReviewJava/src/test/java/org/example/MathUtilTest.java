
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MathUtilTest {
    MathUtil util = new MathUtil();
    StreamEx result = new StreamEx();

    @Test
    void test1() {
        assertEquals(util.sum(1, 1), 2);
    }

    @Test
    void test2() {
        assertEquals(util.sum(2, 1), 3);
    }

    @Test
    void test3() {
        assertEquals(util.sum(1, 2), 3);
    }

    @Test
    void test4() {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> mapList = result.mapEx(number);

        assertNotNull(mapList);
        assertEquals(5, mapList.size());
//        assertEquals(1, mapList.indexOf(0));
        assertEquals(1, mapList.indexOf(1));
//        assertEquals(4, mapList.get(1));
//        assertEquals(9, mapList.get(2));
//        assertEquals(16, mapList.get(3));
//        assertEquals(25, mapList.get(4));
    }
}

