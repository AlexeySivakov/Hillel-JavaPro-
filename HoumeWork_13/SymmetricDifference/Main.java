package SymmetricDifference;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Phone> camera = new HashSet<>();
        Set<Phone> lte = new HashSet<>();
        System.out.println("Имеем список телефонов с камерой:");
        camera.add(new Phone("Телефон 1", 2000));
        camera.add(new Phone("Телефон 2", 3000));
        camera.add(new Phone("Телефон 3", 5000));
        camera.add(new Phone("Телефон 4", 1000));
        camera.add(new Phone("Телефон 5", 4500));
        System.out.println(camera.toString());

        System.out.println("\nТак же имеем второй список телефонов с поддержкой LTE:");
        lte.add(new Phone("Телефон 2", 3000));
        lte.add(new Phone("Телефон 3", 5000));
        lte.add(new Phone("Телефон 4", 1000));
        lte.add(new Phone("Телефон 6", 7000));
        lte.add(new Phone("Телефон 7", 5500));
        System.out.println(lte.toString());

        System.out.println("\nПробуйем вывести телефоны без камеры или поддержки LTE:");
        System.out.println("Результат: ");
        System.out.println(symDifference(camera, lte));
    }

    public static class Phone {
        String model;
        int price;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Phone phone = (Phone) o;
            return price == phone.price && Objects.equals(model, phone.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(model, price);
        }

        public Phone(String model, int price) {
            this.model = model;
            this.price = price;
        }

        @Override
        public String toString() {
            return "{model: " + model + ", price: " + price + "} ";
        }
    }

    public static Set symDifference(Set Camera, Set Lte) {
        Set tempCamera = new HashSet(Camera);
        Set tempLte = new HashSet(Lte);
        tempCamera.removeAll(Lte);
        tempLte.removeAll(Camera);
        tempCamera.addAll(tempLte);
        return tempCamera;
    }
}