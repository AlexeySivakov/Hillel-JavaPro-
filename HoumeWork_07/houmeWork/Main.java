package houmeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем очередь из 10 элементов изаполняем ее 8 элементами:");
        MyQueue<Integer> myTestQueue = new MyQueue(10);
        myTestQueue.add(1);
        myTestQueue.add(2);
        myTestQueue.add(3);
        myTestQueue.add(4);
        myTestQueue.add(5);
        myTestQueue.add(6);
        myTestQueue.add(7);
        myTestQueue.add(8);
        myTestQueue.add(9);
        myTestQueue.add(10);
        System.out.println("Результат:");
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nПробуем добавить в очередь из 10 элементов 11 элемент:");
        System.out.println("Результат:" + myTestQueue.add(11));
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nБерем первый элемент с удалением:");
        System.out.println("Результат: Значение элемента = " + myTestQueue.remove());
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nПробуем добавить в очередь 11 элемент:");
        System.out.println("Результат:" + myTestQueue.add(11));
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nПробуем взять и удалить из очереди еще 3 элемента:");
        System.out.println("Результат 1:" + myTestQueue.remove());
        System.out.println("Результат 2:" + myTestQueue.remove());
        System.out.println("Результат 3:" + myTestQueue.remove());
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nПробуем добавить 12 элемент и взять из очереди элемент без удаления:");
        System.out.println("Результат добавления:" + myTestQueue.add(12));
        System.out.println("Результат получения:" + myTestQueue.element());
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nУдаляем оставшиеся элементы:");
        for (int i = myTestQueue.size(); i > 0; i--) {
            System.out.println("Результат:" + myTestQueue.remove());
        }
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());

        System.out.println("\nПробуем взять и удалить из пустой очереди элемент:");
        System.out.println("Результат:" + myTestQueue.remove());

        System.out.println("\nПробуем взять без удаления из пустой очереди элемент:");
        System.out.println("Результат:" + myTestQueue.element());

        System.out.println("\nПробуем добавить 2 элемента в очередь:");
        System.out.println("Результат:" + myTestQueue.add(13));
        System.out.println("Результат:" + myTestQueue.add(14));
        System.out.println("Очередь: " + myTestQueue.toString());
        System.out.println("Что внутри:");
        System.out.println(myTestQueue.toStringAll());


    }
}
