package practice_11;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static int front;
    private static int rear;
    private static Object[] elements = new Object[10];

    static void fixCapacity(int capacity)
    {
        int len = elements.length;
        if (capacity > len)
        {
            Object[] newElements = new Object[elements.length * 2];
            int i = 0;
            while (rear != front)
            {
                newElements[i] = elements[front];
                front = (front + 1) % len;
                i++;
            }
            front = 0;
            rear = len - 1;
            elements = newElements;
        }
    }
    
    public static void enqueue(Object element)
    {
        assert element != null;
        fixCapacity(size + 2);
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }
    
    public static Object element()
    {
        assert size > 0;
        return elements[front];
    }
    
    public static Object dequeue()
    {
        Object ret = element();
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return ret;
    }
    
    public static int size()
    {
        return size;
    }

    public static boolean isEmpty()
    {
        return (size == 0);
    }
    
    public static void clear()
    {
        front = 0;
        rear = 0;
        size = 0;
        elements = new Object[10];
    }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "data=" + Arrays.toString(elements) +
                '}';
    }
}
