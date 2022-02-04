package com.javafee.lesson.generic;

import java.util.Objects;

public class LinkedList<T> {
    private T data;
    private LinkedList root;
    private LinkedList next;

    public void add(T data) {
        LinkedList<T> node = create(data);

        if (Objects.isNull(root)) {
            root = node;
            return;
        }

        LinkedList<T> tmp = root;
        while (!Objects.isNull(tmp.next))
            tmp = tmp.next;
        node.root = tmp;
        tmp.next = node;
    }

    public T get(int index) {
        int counter = 0;
        LinkedList<T> tmp = root;
        while (!Objects.isNull(tmp.next) && counter < index) {
            tmp = tmp.next;
            counter++;
        }
        return counter < index || index < 0 ? null : tmp.data;
    }

    public int get(T data) {
        LinkedList<T> tmp = root;
        int counter = 0;
        while (!Objects.isNull(tmp)) {
            if (data.equals(tmp.data))
                return counter;
            tmp = tmp.next;
            counter++;
        }

        return -1;
    }

    private LinkedList<T> create(T data) {
        LinkedList<T> node = new LinkedList<>();
        node.data = data;
        return node;
    }

    @Override
    public String toString() {
        LinkedList<T> tmp = root;
        if (Objects.isNull(root)) return "[]";
        StringBuilder str = new StringBuilder("[").append(root.data);
        while (!Objects.isNull(tmp.next)) {
            tmp = tmp.next;
            str.append(",").append(tmp.data);
        }
        return str.append("]").toString();
    }
}
