package HomeWork;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        System.out.println("Заполняем:");
        myLinkedList.add("Нулевой");
        myLinkedList.add("Первый");
        myLinkedList.add("Второй");
        myLinkedList.add("Третий");
        myLinkedList.add("Четвертый");
        myLinkedList.printList();
        System.out.println();

        System.out.println();
        System.out.println("Добавление по индексу: ");
        System.out.print("Исходный: " );
        myLinkedList.printList();
        myLinkedList.add(1, "Добавленный");
        System.out.println();
        System.out.print("После добавления: ");
        myLinkedList.printList();
        System.out.println();

        System.out.println();
        System.out.println("Получить элемент по индексу:");
        System.out.print("Полученный элемент = " );
        System.out.println(myLinkedList.get(2));
        System.out.println();

        System.out.println("Удалить элемент по индексу: ");
        System.out.print("Исходный: " );
        myLinkedList.printList();
        System.out.println();
        myLinkedList.deleteAtIndex(3);
        System.out.print("После удаления: " );
        myLinkedList.printList();
        System.out.println();

        System.out.println();
        System.out.println("Получить размер листа: "+myLinkedList.size());
        System.out.println();

        System.out.println("Очистить: ");
        myLinkedList.clear();
        System.out.println();

        System.out.println("Добавим нолевой: ");
        myLinkedList.add("Нулевой");
        myLinkedList.printList();
    }

}
