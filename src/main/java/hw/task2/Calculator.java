package hw.task2;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T x, V y) {
        return Double.parseDouble(x.toString()) + Double.parseDouble(y.toString());
    }

    public static <T extends Number, V extends Number> double multiply(T x, V y) {
        return Double.parseDouble(x.toString()) * Double.parseDouble(y.toString());
    }

    public static <T extends Number, V extends Number> double divide(T x, V y) {
        return Double.parseDouble(x.toString()) / Double.parseDouble(y.toString());
    }

    public static <T extends Number, V extends Number> double subtract(T x, V y) {
        return Double.parseDouble(x.toString()) - Double.parseDouble(y.toString());
    }
}
