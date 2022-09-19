import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> testMap = new MyHashMap<>();
        System.out.println("Добавляем ноды с ключами \"Один\", \"Два\" и \"Три\":");
        testMap.put("Один", "1");
        testMap.put("Два", "2");
        testMap.put("Три", "3");
        System.out.println(testMap.toString());
        System.out.println("Добавляем ноды с ключами \"Четыре\" и \"Пять\":");
        testMap.put("Четыре", "4");
        testMap.put("Пять", "5");
        System.out.println("Добавляем ноду с существующим ключем \"Два\" и другим значением:");
        testMap.put("Два", "тест");
        System.out.println(testMap.toString());

        System.out.println("Вывдим на экран значение элемента с ключем \"Два\":");
        System.out.println(testMap.get("Два"));
        System.out.println("Вывдим на экран значение элемента с ключем \"Три\":");
        System.out.println(testMap.get("Три"));
        System.out.println("Вывдим на экран значение элемента с ключем \"Четыре\":");
        System.out.println(testMap.get("Четыре"));
        System.out.println("Вывдим на экран значение элемента с несуществующим ключем \"99\":");
        System.out.println(testMap.get("99"));

        System.out.println("Удаляем значение элемента с ключем \"Два\":");
        System.out.println("Результат: " + testMap.remove("Два"));
        System.out.println(testMap.toString());

        System.out.println("Удаляем значение элемента с несуществующим ключем \"99\":");
        System.out.println("Результат: " + testMap.remove("Два"));
        System.out.println(testMap.toString());

        System.out.println("Выводим на экран все ключи:");
        System.out.println(Arrays.toString(testMap.getAllKey()));
    }
}
