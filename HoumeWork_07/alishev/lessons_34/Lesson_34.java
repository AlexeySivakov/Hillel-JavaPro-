package lessons_34;

import java.util.ArrayList;
import java.util.List;

public class Lesson_34 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            System.out.println(animal);
        }
    }
}
