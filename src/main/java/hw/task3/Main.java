package hw.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.<String>compareArrays(new String[] {"Hello", "World!"}, new String[] {"Hello", "World!"}));
        System.out.println(Arrays.<Integer>compareArrays(new Integer[] {1, 13, 3}, new Integer[] {1, 13, 3}));
    }
}
