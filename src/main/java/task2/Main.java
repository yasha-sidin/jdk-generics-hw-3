package task2;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> myCollection = new MyCollection<>();
        myCollection.add(1);
        myCollection.add(3);
        myCollection.add(3);
        myCollection.add(3);
        myCollection.add(64);
        myCollection.add(3);
        myCollection.add(56532);
        myCollection.add(3);
        System.out.println(myCollection);
        myCollection.delete(1);
        System.out.println(myCollection);
        myCollection.delete(3);
        System.out.println(myCollection);
        myCollection.delete(64);
        System.out.println(myCollection);
        myCollection.delete(56532);
        System.out.println(myCollection);
    }
}
