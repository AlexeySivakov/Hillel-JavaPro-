package HomeWork;


class MyLinkedList<T> implements MyLinkedListInterface<T>{
    Node head;
    int size = 0;

    class Node<T> {
        T val;
        Node next;

        public Node(T val) {
            this.val = val;
            this.next = null;
        }
    }

    //Получить значение индексного узла в связанном списке. Если индекс недействителен, вернет null
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return (T) node.val;
    }


    //Добавить значения val к последнему элементу связанного списка.
    public void add(T val) {
        add(size, val);
    }

    // Если индекс равен длине связанного списка, узел будет добавлен в конец связанного списка. Если индекс больше длины, узел не будет вставлен.
    public void add(int index, T val) {
        if (index < 0 || index > size) return;

        Node newNode = new Node(val);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node node = head;
        if (node.next != null) {
            for (int i = 1; i < index; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        } else {
            node.next = newNode;

        }
        size++;

    }


    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            if (head == null) return;
            head = head.next;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {

            if (current == null) return;
            current = current.next;
        }


        if (current == null) return;
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }


    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + "; ");
            node = node.next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
        System.out.println("Список пуст");
    }
}