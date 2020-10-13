package practice_8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    /**
     * @param capacity of list
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return capacity of list
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element to add
     */
    public void add(E element){
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
