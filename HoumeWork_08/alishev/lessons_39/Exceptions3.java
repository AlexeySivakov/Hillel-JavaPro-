package lessons_39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked exception (Compile time exception) = исключительные случаи в работе программы
        // Unchecked exception (Runtime exception) = ошибка в работе программы

        //File file = new File("test");
        //try {
        //    Scanner scanner = new Scanner(file);
        //} catch (FileNotFoundException e) {
        //    System.out.println("");
        //}

        //int i = 1 / 0;

        //String name = null;
        //name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
