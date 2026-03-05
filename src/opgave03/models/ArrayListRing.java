package opgave03.models;

import java.util.ArrayList;

public class ArrayListRing <E> implements Ring<E> {
    private ArrayList<E> items = new ArrayList<>();
    private int currentItem;

//    Brug % til at lave cirklen

    @Override
    public void advance() {
        if (!isEmpty()) {

        }
    }

    @Override
    public E getCurrentItem() {
        return items.get(currentItem);
    }

    @Override
    public void add(E item) {

    }

    @Override
    public boolean removeItem(E itemToBeRemoved) {
        for (E item : items) {
            if (item.equals(itemToBeRemoved)) {
                item = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public E removeCurrentItem() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return currentItem == 0;
    }
}
