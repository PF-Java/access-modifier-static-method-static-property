package BuildClassStack;

import org.junit.Assert;
import org.junit.Test;

public class NumbersStackTest {

    NumbersStack numbersStack = new NumbersStack();

    @Test
    public void testCount() {
        numbersStack.getCount();
        int expected = 0;
        int result = numbersStack.getCount();
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testPush() {
        numbersStack.push(10);
        int expected = 1;
        int result = numbersStack.getCount();
    }

    @Test
    public void testPush1() {
        numbersStack.push(10);
        int result = numbersStack.getCount();
        Assert.assertEquals(1,result);
        numbersStack.push(20);
        int result2 = numbersStack.getCount();
        Assert.assertEquals(2,result2);
        numbersStack.push(30);
        int result3 = numbersStack.getCount();
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testPop() {
        numbersStack.push(10);
        numbersStack.push(20);
        numbersStack.push(30);
        int result = numbersStack.pop();
        int expected = 30;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testPop2() {
        int result = numbersStack.getCount();
        Assert.assertEquals(0, result);

        numbersStack.push(10);
        int result1 = numbersStack.getCount();
        Assert.assertEquals(1, result1);

        numbersStack.push(20);
        int result2 = numbersStack.getCount();
        Assert.assertEquals(2, result2);

        int result3 = numbersStack.pop();
        Assert.assertEquals(20,result3);

        int result4 = numbersStack.pop();
        Assert.assertEquals(10,result4);
    }
}