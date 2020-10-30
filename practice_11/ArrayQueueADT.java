package practice_11;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private int front;
    private int rear;
    private Object[] elements = new Object[10];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        assert queue != null;
        if (capacity > queue.elements.length) {
            queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        }
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue != null;
        if(queue.size>0) {
            Object value = element(queue);
            Object[] t_elements = new Object[--queue.size];
            System.arraycopy(queue.elements, 1, t_elements, 0, queue.size);
            queue.elements = t_elements;
            return value;
        }

        return new ArrayIndexOutOfBoundsException();
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size > 0 ? queue.elements[0] : new ArrayIndexOutOfBoundsException();

    }
    public static int size(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        assert queue != null;
        return (queue.size == 0);
    }

    public static void clear(ArrayQueueADT queue)
    {
        assert queue != null;
        queue.front = 0;
        queue.rear = 0;
        queue.size = 0;
        queue.elements = new Object[10];
    }

    @Override
    public String toString() {
        return "ArrayQueueADT{" +
                "elements=" + (Arrays.toString(elements)) +
                '}';
    }
}