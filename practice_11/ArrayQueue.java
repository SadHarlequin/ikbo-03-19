package practice_11;

import java.util.ArrayList;

public class ArrayQueue<E> {
    private int size;
    private int front;
    private int rear;
    private int capacity;
    private ArrayList<E> elements;

    public ArrayQueue() {
        capacity=10;
        elements = new ArrayList<>(capacity);
    }

    private void fixCapacity()
    {
        int len = elements.size()+2;
        if (len>capacity)
        {
            capacity = elements.size()*2;
            ArrayList<E> newElements = new ArrayList<E>(capacity);
            int i = 0;
            while (rear != front)
            {
                newElements.set(front,elements.get(front));
                front = (front + 1) % len;
                i++;
            }
            front = 0;
            rear = len - 1;
            elements = newElements;
        }
    }

    public void enqueue(E element)
    {
        assert element != null;
        fixCapacity();
        elements.add(element);
        rear = (rear + 1) % elements.size();
        size++;
    }


    public E element()
    {
        assert size > 0;
        return elements.get(front);
    }

    public E dequeue()
    {
        E first = element();
        elements.remove(front);
        front = (front + 1) % elements.size();
        size--;
        return first;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }


    public void clear()
    {
        front = 0;
        rear = 0;
        size = 0;
        elements.clear();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "elements=" + elements.toString() +
                '}';
    }
}