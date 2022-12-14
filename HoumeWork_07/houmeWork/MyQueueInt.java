package houmeWork;

public interface MyQueueInt<T> {

    //Вставляет элемент в очередь, если очередь полность заполнена возвращает false
    boolean add(T o);

    //Возвращает и удаляет головной элемент очереди возвращает null если очередь пуста
    T remove();

    //Возвращает но не удаляет головной элемент очереди возвращает null если очередь пуста
    T element();

    //Возвращает колличество єлементов в очереди
    int size();

}
