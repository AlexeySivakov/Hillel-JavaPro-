package homeWork;

class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private Node head;
    private Node last;
    private int size = 0;

    class Node<T> {
        T val;
        Node next;
        Node prew;

        public Node(T val, Node next, Node prew) {
            this.val = val;
            this.next = next;
            this.prew = prew;
        }
    }

    //Получить значение по индексу.
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        Node tempNode = new Node(null, null, null);
        if (index > 0 & index < size) {
            //Если индекс во второй половине списка начинаем с конца если в первой начинаем с начала
            if (index > size / 2) {
                tempNode = last;
                for (int i = 0; i < size - (index + 1); i++) {
                    tempNode = tempNode.prew;
                }
            } else {
                tempNode = head;
                for (int i = 0; i < index; i++) {
                    tempNode = tempNode.next;
                }
            }
        } else {
            if (index == 0) {
                return (T) head.val;
            }
            if (index == size) {
                return (T) last.val;
            }
        }
        return (T) tempNode.val;
    }

    //Добавить значения в конец списка.
    public boolean addEnd(T val) {
        Node newNode = new Node(val, null, null);
        Node tempNode = new Node(val, null, null);
        if (size == 0) {
            head = newNode;
            last = newNode;
        } else {
            if (size < 2) {
                last = newNode;
                last.prew = head;
                head.next = last;
            } else {
                tempNode = last;
                last = newNode;
                last.prew = tempNode;
                tempNode.next = last;
            }
        }
        size++;
        return true;
    }

    //Добавить значение в начало списка
    public boolean addHead(T val) {
        Node newNode = new Node(val, null, null);
        Node tempNode = new Node(null, null, null);
        if (size == 0) {
            head = newNode;
            last = newNode;
        } else {
            if (size < 2) {
                head = newNode;
                head.next = last;
                last.prew = head;
            } else {
                tempNode = head;
                head = newNode;
                head.next = tempNode;
                tempNode.prew = head;
            }
        }
        size++;
        return true;
    }

    // Добавить элемент по индексу.
    public boolean addAtIndex(int index, T val) {
        if (index < 0 || index > size) return false;//если индекс за пределами списка прервать.
        Node newNode = new Node(val, null, null);
        Node tempNode = new Node(null, null, null);
        if (index > 0 & index < size) {
            //Если индекс во второй половине списка начинаем с конца если в первой начинаем с начала
            if (index > size / 2) {
                tempNode = last;
                for (int i = 0; i < size - index; i++) {
                    tempNode = tempNode.prew;
                }
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                newNode.prew = tempNode;
                tempNode = newNode.next;
                tempNode.prew = newNode;
                size++;
            } else {
                tempNode = head;
                for (int i = 0; i < index; i++) {
                    tempNode = tempNode.next;
                }
                newNode.prew = tempNode.prew;
                tempNode.prew = newNode;
                newNode.next = tempNode;
                tempNode = newNode.prew;
                tempNode.next = newNode;
                size++;
            }
        } else {
            //Если индекс в начале просто добавляем в начало
            if (index == 0) {
                addHead(val);
            }
            //Если индекс равен размеру просто добавляем в конец
            if (index == size) {
                addEnd(val);
            }
        }
        return true;
    }

    //Удалить эллемент по индексу
    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) return;
        Node tempNode = new Node(null, null, null);
        if (index > 0 & index < size - 1) {
            //Если индекс во второй половине списка начинаем с конца если в первой начинаем с начала

            if (index > size / 2) {
                tempNode = last;
                for (int i = 0; i < size - (index + 1); i++) {
                    tempNode = tempNode.prew;
                }
                tempNode.prew.next = tempNode.next;
                tempNode.next.prew = tempNode.prew;
                tempNode = null;
                size--;
            } else {
                tempNode = head;
                for (int i = 0; i < index; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.prew.next = tempNode.next;
                tempNode.next.prew = tempNode.prew;
                size--;
            }
        } else {
            //Если индекс в начале просто удаляем первый
            if (index == 0) {
                head = head.next;
                head.prew = null;
                size--;
            }
            //Если индекс равен размеру просто удаляем последний
            if (index == size - 1) {
                last = last.prew;
                last.next = null;
                size--;
            }
        }
    }

    //Распечатать список
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + "; ");
            node = node.next;
        }
        System.out.println();
    }

    //Получить размер текущего списка
    public int size() {
        return size;
    }

    //Очистить список
    public void clear() {
        head = null;
        last = null;
        size = 0;
        System.out.println("Список пуст");
    }
}