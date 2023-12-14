package hw.task4;

public class Pair<T, V> {
    private final T left;
    private final V right;

    public Pair(T left, V right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public V getRight() {
        return right;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Pair { left: ").append(getLeft()).append(", ").append("right: ").append(getRight()).append(" }");
        return sb.toString();
    }
}
