public interface MyHashMapInt<K, V> {
    //Добавляем эллемент
    public void put(K key, V value);

    //Берем значение по ключу
    public V get(K key);

    //Удаляем эллемент по ключу
    public boolean remove(K key);

    //Возвращаем все ключи
    K[] getAllKey();

}
