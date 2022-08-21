package homeWork;

interface MyLinkedListInterface<T> {
    T get(int index);

    public boolean addEnd(T val);

    public boolean addHead(T val);

    public boolean addAtIndex(int index, T val);

    public void deleteAtIndex(int index);

    public void printList();

    public int size();

    public void clear();
}
