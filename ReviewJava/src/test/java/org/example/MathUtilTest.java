
package org.example;
    import org.junit.jupiter.api.Test;

    import static junit.framework.TestCase.assertEquals;


public class MathUtilTest {
        MathUtil util = new MathUtil();

        @Test
        void test1(){
            assertEquals(util.sum(1,1),2);
        }
        @Test
        void test2(){
            assertEquals(util.sum(2,1),3);
        }
        @Test
        void test3(){
            assertEquals(util.sum(1,2),3);
        }
    }

