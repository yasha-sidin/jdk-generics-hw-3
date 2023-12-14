package hw.task1;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */
public class MyCollectionWithIterator<T> {
    private Iterator<T> iterator = new MyIterator<>();
    private Object[] array;
    private int size = 0;

    public MyCollectionWithIterator() {
        array = new Object[0];
    }

    public void add(T value) {
        size++;
        array = Arrays.copyOf(array, size);
        array[size - 1] = value;
    }

    public boolean delete(T el) {
        int currentSize = size;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(el)) {
                size--;
                Object[] tempArray = new Object[size];
                int index = 0;
                for (int j = 0; j < array.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    tempArray[index] = array[j];
                    index++;
                }
                array = tempArray;
                i--;
            }
        }
        return size != currentSize;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[ ]";
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (Object el : array) {
            sb.append(el).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    public Iterator<T> getIterator() {
        return iterator;
    }

    private class MyIterator<T> implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < MyCollectionWithIterator.this.size;
        }

        @Override
        public T next() {
            T val = (T) MyCollectionWithIterator.this.array[index];
            index++;
            return val;
        }
    }
}
