public interface MyStackInterface<T> {
    //Добавляет эллемент в очередь
    boolean push(T item);

    //Берет последний элемент с удалением
    T pop();

    //Берет последний элемент без удалением
    T pick();

    //Проверяет пуст ли список
    boolean isEmpty();
}
