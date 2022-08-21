package lessons_26;

import lessons_26.interfaces.Animal;
import lessons_26.interfaces.Info;
import lessons_26.interfaces.Person;

public class Lesson_26 {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }

}
