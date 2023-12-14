package task1;

import java.io.DataInput;
import java.io.InputStream;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), конструктор,
 * принимающий на вход параметры типа (T, V, K), методы
 * возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
 * классов для трех переменных класса. Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable
 * (классы оболочки, String), V должен реализовать интерфейс DataInput и расширять класс InputStream,
 * K должен расширять класс
 * Number
 */
public class GenericClass<T extends Comparable<T>, V extends InputStream & DataInput, K extends Number> {
    private final T tValue;
    private final V vValue;
    private final K kValue;

    public GenericClass(T tValue, V vValue, K kValue) {
        this.tValue = tValue;
        this.vValue = vValue;
        this.kValue = kValue;
    }

    public T getTValue() {
        return tValue;
    }

    public V getVValue() {
        return vValue;
    }

    public K getKValue() {
        return kValue;
    }

    public String getClassesName() {
        StringBuffer sb = new StringBuffer();
        sb.append(tValue.getClass().getSimpleName()).append('\n');
        sb.append(vValue.getClass().getSimpleName()).append('\n');
        sb.append(kValue.getClass().getSimpleName()).append('\n');
        return sb.toString();
    }
}
