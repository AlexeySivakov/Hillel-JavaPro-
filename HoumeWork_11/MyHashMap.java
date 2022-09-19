import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyHashMapInt<K, V> {
    private Node[] map = new Node[2];
    private int size = 0;
    private final float SIZE_LOAD = 0.75F;


    @Override
    public void put(K key, V value) {
        grovMass();
        Node addedNode = new Node(key, value);
        boolean flagAdded = true;
        if (map[getIndexFromHash(key)] != null) {
            //Если ячейка массива не пустая проверяем есть ли нода с данным ключем
            Node tempNode = map[getIndexFromHash(key)];
            while (tempNode != null) {
                //Если в ячейке массива песть нода с данным ключем просто меняем значение
                if (Objects.equals(tempNode.getKey(), key)) {
                    tempNode.setValue(value);
                    flagAdded = false;
                    break;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
            if (flagAdded) {
                //Если перебрали все ноды в ячейке массива и нет такого ключа добавляем ноду
                tempNode = map[getIndexFromHash(key)];
                map[getIndexFromHash(key)] = addedNode;
                addedNode.next = tempNode;
                size++;
            }
        } else {
            //Если ячейка массива пустая просто добавляем ноду в ячейку
            map[getIndexFromHash(key)] = addedNode;
            size++;
        }
    }

    @Override
    public V get(K key) {
        if (map[getIndexFromHash(key)] != null) {
            //Если ячейка массива не пустая проверяем есть ли нода с данным ключем
            Node tempNode = map[getIndexFromHash(key)];
            while (tempNode != null) {
                //Если в ячейке массива есть нода с данным ключем возвращаем ее значение
                if (Objects.equals(tempNode.getKey(), key)) {
                    return (V) tempNode.value;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(K key) {
        if (map[getIndexFromHash(key)] != null) {
            //Если ячейка массива не пустая проверяем есть ли нода с данным ключем
            Node tempNode = map[getIndexFromHash(key)];
            Node prewNode = null;
            while (tempNode != null) {
                //Если в ячейке массива есть нода с данным ключем просто меняем значение
                if (Objects.equals(tempNode.getKey(), key)) {
                    tempNode = tempNode.getNext();
                    if (prewNode != null) {
                        prewNode.setNext(tempNode);
                    }
                    size--;
                    return true;
                } else {
                    prewNode = tempNode;
                    tempNode = tempNode.getNext();
                }
            }
        }
        return false;
    }

    @Override
    public K[] getAllKey() {
        K[] result = (K[]) new Object[size];
        int counter = 0;
        for (Node node : map) {
            if (node != null) {
                result[counter] = (K) node.getKey();
                counter++;
                Node<K, V> tempNode = node.getNext();
                while (tempNode != null) {
                    result[counter] = (K) tempNode.getKey();
                    counter++;
                    tempNode = tempNode.getNext();
                }
            }
        }
        return result;
    }

    private int getIndexFromHash(K key) {
        if (key == null) {
            return 0;
        } else {
            return key.hashCode() % map.length;
        }
    }

    private void grovMass() {
        if (map == null || map.length == 0) {
            map = new Node[16];
        } else {
            if (size >= map.length * SIZE_LOAD) {
                int newCapacity = map.length << 1;
                Node<K, V>[] tempMap = map;
                map = new Node[newCapacity];
                size = 0;
                for (Node<K, V> node : tempMap) {
                    if (node != null) {
                        put(node.getKey(), node.getValue());
                        Node<K, V> tempNode = node.getNext();

                        while (tempNode != null) {
                            put(tempNode.getKey(), tempNode.getValue());
                            tempNode = tempNode.getNext();
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("size=" + size + "; \n");
        result.append("map.length=" + map.length + "; \n");
        result.append("Содежимое: \n");
        for (Node node : map) {
            result.append("[");
            if (node != null) {
                result.append(node);
                result.append("; ");
                Node<K, V> tempNode = node.getNext();
                while (tempNode != null) {
                    result.append(tempNode);
                    result.append("; ");
                    tempNode = tempNode.getNext();
                }
            }
            result.append("]");
        }
        result.append("\n");
        return result.toString();
    }

    class Node<K, V> {
        private K key;
        private V value;
        private Node next = null;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }
}
