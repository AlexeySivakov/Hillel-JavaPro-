import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner(System.in);
        Map<String, String> testMap = new HashMap<>();
        testMap.put("Москва", "Ивановы");
        testMap.put("Киев", "Петровы");
        testMap.put("Лондон", "Абрамовичи");
        System.out.println("Введите название населенного пункта:\nВаринты:\n - Москва;\n - Киев;\n - Лондон.");
        result = testMap.get(scanner.nextLine());
        if (result != null){
            System.out.println("Результат: " + result);
        }else {
            System.out.println("Результат: Поиск не дал результатов либо населенный пункт введен не верно");
        }
    }
}
