package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /**
     * Create a bag with the given capacity.
     */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /**
     * Create a bag with capacity 10.
     */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (!isFull()) {
            items[size] = newEntry;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if (!isEmpty()) {
            E itemToBeRemoves = items[size - 1];
            items[size - 1] = null;
            size--;
            return itemToBeRemoves;
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        for (int index = 0; index < size; index++) {
            if (items[index].equals(anEntry)) {
                items[index] = items[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (E item : items) {
            item = null;
        }
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (E item : items) {
            if (item.equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        for (E item : items) {
            if (item.equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] newArray = (E[]) new Object[size];
        for (int index = 0; index < size; index++) {
            newArray[index] = items[index];
        }
//        kan også laves således:
//        System.arraycopy(items, 0, newArray, 0, size);
        return newArray;
    }
}