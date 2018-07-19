package BuildClassStack;

public class NumbersStack {
    int[] numbers = new int[20];
    int count = 0;
    int top;

    public NumbersStack() {
    }

    public NumbersStack(int number) {
    }


    public int getCount() {
        return count;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        top = numbers[count - 1];
        count--;
        return top;
    }
}
