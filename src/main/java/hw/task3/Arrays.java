package hw.task3;

import java.lang.reflect.Array;

public class Arrays {
    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) throw new RuntimeException("These arrays lengths must be equal");
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
