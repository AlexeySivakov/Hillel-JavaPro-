package Alishev.Alishev_18;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("jkli");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
    }
}

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        }
        name = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            this.age = userAge;
        }

    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}

