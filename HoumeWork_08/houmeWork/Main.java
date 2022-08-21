public class Main {
    public static void main(String[] args) {
        MyStack<Integer> testStack = new MyStack<>(4);
        System.out.println("Добавляем 4 лемента");
        System.out.println(testStack.push(1));
        System.out.println(testStack.push(2));
        System.out.println(testStack.push(3));
        System.out.println(testStack.push(4));
        System.out.println(testStack.toString());

        System.out.println("\nПробуем добавить пятый:");
        System.out.println(testStack.push(5));
        System.out.println(testStack.toString());

        System.out.println("\nПробуем добавить пятый:");
        System.out.println(testStack.push(5));
        System.out.println(testStack.toString());

        System.out.print("\nПроверяем стек пустой? \nРезультат: ");
        System.out.println(testStack.isEmpty());

        System.out.print("\nВозращаем и удаляем вершину \nРезультат: ");
        System.out.println(testStack.pop());
        System.out.println(testStack.toString());

        System.out.print("\nВозращаем и удаляем вершину \nРезультат: ");
        System.out.println(testStack.pop());
        System.out.println(testStack.toString());

        System.out.print("\nВозращаем и НЕ удаляем вершину \nРезультат: ");
        System.out.println(testStack.pick());
        System.out.println(testStack.toString());

        System.out.print("\nВозращаем и удаляем 3 вершины \nРезультат: ");
        System.out.println(testStack.pop() + ", " + testStack.pop() + ", " + testStack.pop() + ";");
        System.out.println(testStack.toString());

        System.out.print("\nПроверяем стек пустой? \nРезультат: ");
        System.out.println(testStack.isEmpty());
    }
}
