package BuildClassMyPoint;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyPointTest {

    @Test
    public void distance() {
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10, 30.5);

        double expected = 32.09750769140807;
        double actual = MyPoint.distance(a,b);
        Assert.assertEquals(expected,actual, 0);
    }
}