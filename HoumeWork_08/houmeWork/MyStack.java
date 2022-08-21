import java.util.Arrays;

public class MyStack<T> implements MyStackInterface {
    private int maxSize;
    private int top;
    private T[] arrayStack;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.arrayStack = ((T[]) new Object[maxSize]);
    }

    @Override
    public boolean push(Object item) {
        if (top >= maxSize - 1) {
            return false;
        } else {
            arrayStack[++top] = (T) item;
            return true;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            return arrayStack[top--];
        }
    }

    @Override
    public T pick() {
        if (isEmpty()) {
            return null;
        } else {
            return arrayStack[top];
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "Что внутри:\n" +
                "maxSize=" + maxSize + ", top=" + top +
                ", arrayStack=" + Arrays.toString(arrayStack) +
                '}';
    }
}
