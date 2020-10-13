package practice_8;

import java.util.Collection;

public interface IWaitList<E> {
    /**
     * @param element we want to add
     */
    void add(E element);
    /**
     * @return removed element
     */
    E remove();
    /**
     *
     * @param element to check on contain
     * @return is element on list
     */
    boolean contains(E element);
    /**
     * @param c contains "c" in all list
     * @return is exist c in list
     */
    boolean containsAll(Collection<E> c);
    /**
     * @return is list empty or not
     */
    boolean isEmpty();
}
