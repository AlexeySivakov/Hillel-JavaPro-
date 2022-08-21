package homeWork;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addEnd(0);
        myLinkedList.addEnd(1);
        myLinkedList.addEnd(2);
        myLinkedList.addEnd(3);
        myLinkedList.addEnd(4);
        myLinkedList.addEnd(5);
        System.out.println("Распечатать список:");
        myLinkedList.printList();
        System.out.println("Добавить эелемент 9 в начало:");
        myLinkedList.addHead(9);
        myLinkedList.printList();
        System.out.println("Добавить эелемент 9 в конец:");
        myLinkedList.addEnd(9);
        myLinkedList.printList();
        System.out.println("Удалить эелемент 7:");
        myLinkedList.deleteAtIndex(7);
        myLinkedList.printList();
        System.out.println("Удалить эелемент 0:");
        myLinkedList.deleteAtIndex(0);
        myLinkedList.printList();
        System.out.println("Добавить эелемент 9 в позицию 3:");
        myLinkedList.addAtIndex(3, 9);
        myLinkedList.printList();
        System.out.println("Удалить эелемент с позиции 3:");
        myLinkedList.deleteAtIndex(3);
        myLinkedList.printList();
        System.out.println("Вывести размер списка:");
        System.out.println(myLinkedList.size());
        System.out.println("Вывести эллемент списка с позиции 4:");
        System.out.println(myLinkedList.get(4));
        System.out.println("Очистить список:");
        myLinkedList.clear();
    }

}
