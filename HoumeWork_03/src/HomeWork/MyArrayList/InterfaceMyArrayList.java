package HomeWork.MyArrayList;

public interface InterfaceMyArrayList<T> {
    int size();

    void add(T element);

    void add(T element, int position);

    void remove(int position);

    void clear();

    T get(int position);

    String toString();
}
