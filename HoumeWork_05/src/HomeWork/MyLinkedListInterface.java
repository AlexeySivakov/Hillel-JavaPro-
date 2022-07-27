package HomeWork;

interface MyLinkedListInterface<T> {
    T get(int index);
    public void add(T val);
    public void add(int index, T val);
    public void deleteAtIndex(int index);
    public void printList();
    public int size();
    public void clear();

}
