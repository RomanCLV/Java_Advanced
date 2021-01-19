package main.exercice5;

import java.util.*;

public class MyIterable<T> implements Iterable<T> {

    private List<T> items;

    public MyIterable() {
        items = new ArrayList<>();
    }

    public void add(T element) {
        items.add(element);
    }

    public void insert(int index, T element) {
        items.add(index, element);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void remove(int index) {
        items.remove(index);
    }

    public void set(int index, T element) {
        items.set(index, element);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
