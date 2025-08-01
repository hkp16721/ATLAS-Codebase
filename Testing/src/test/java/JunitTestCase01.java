import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTestCase01 {
    protected int val1, val2;

    @Before
    public void setUp(){
        val1 = 100;
        val2 = 200;
    }
    @Test
    public void testSum(){
        //setUp();
        double sum = val1 + val2;
        System.out.println(sum);
        assertTrue(sum==301);
    }

}
