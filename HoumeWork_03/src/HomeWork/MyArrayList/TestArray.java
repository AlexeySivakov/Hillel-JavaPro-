package HomeWork.MyArrayList;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyArrayList<String> TestArrayList = new MyArrayList<>();
        System.out.println(TestArrayList.size());
        TestArrayList.add("Ноль");
        System.out.println(TestArrayList.size());
        TestArrayList.add("Один");
        System.out.println(TestArrayList.size());
        TestArrayList.add("Два");
        System.out.println(TestArrayList.size());
        TestArrayList.add("Три");
        System.out.println(TestArrayList.size());
        TestArrayList.add("Четыре");

        System.out.println(TestArrayList.toString());
        System.out.println("get:");
        System.out.println(TestArrayList.get(4));

        System.out.println("remove:");
        TestArrayList.remove(0);
        System.out.println(TestArrayList.toString());
        System.out.println("add:");
        TestArrayList.add("Добавленый", 2);
        System.out.println(TestArrayList.toString());

    }
}
