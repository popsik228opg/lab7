public class MyBox<T extends Comparable<T>> implements Comparable<MyBox<T>> {

    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    @Override
    public int compareTo(MyBox<T> other) {
        if (this.isEmpty() && other.isEmpty()) {
            return 0;
        }

        if (this.isEmpty()) {
            return -1;
        }

        if (other.isEmpty()) {
            return 1;
        }

        return this.item.compareTo(other.item);
    }

    public static <T extends Comparable<T>> T findMax(
            MyBox<T> first, MyBox<T> second) {

        if (first.isEmpty() || second.isEmpty()) {
            throw new IllegalArgumentException(
                    "Коробки должны содержать элементы");
        }

        if (first.get().compareTo(second.get()) >= 0) {
            return first.get();
        }

        return second.get();
    }
}
