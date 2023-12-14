package hw.task1;

import task2.MyCollection;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollectionWithIterator<String> myCollectionWithIterator = new MyCollectionWithIterator<>();
        myCollectionWithIterator.add("First");
        myCollectionWithIterator.add("Second");
        myCollectionWithIterator.add("Third");
        for (Iterator<String> it = myCollectionWithIterator.getIterator(); it.hasNext(); ) {
            String val = it.next();
            System.out.println(val);
        }
    }
}
