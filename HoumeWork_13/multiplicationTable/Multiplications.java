package multiplicationTable;

import java.util.Scanner;

public class Multiplications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Таблица умножения: ");
            printTable();
            System.out.println("Если желаете завершить введите q. Чтобы продолжить введите любое значение.");
            String stop = scanner.next();
            if (stop.equals("q")) {
                break;
            }
        }
        System.out.println("Всего доброго!");
        scanner.close();
    }

    static private void printTable() {
        int val = 2;
        int col = 4;
        for (int i = 0; i < 2; i++) {
            Multiplications(val, col);
            val = val + col;
            System.out.println();
        }
    }

    static private void Multiplications(int val, int col) {
        for (int i = 2; i <= 9; i++) {
            for (int j = val; j < col + val; j++) {
                System.out.print(j + " " + "*" + " " + i + " " + "=" + " ");
                System.out.printf("%2d", (j * i));
                System.out.print("     ");
            }
            System.out.print("\n");
        }
    }


}
