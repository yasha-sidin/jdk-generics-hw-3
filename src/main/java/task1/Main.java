package task1;

public class Main {
    public static void main(String[] args) {
        GenericClass<MyComparable, MyInputStream, Integer> genericClass = new GenericClass<>(new MyComparable(),
                new MyInputStream(new byte[16]), 45);
        System.out.println(genericClass.getClassesName());
    }
}
