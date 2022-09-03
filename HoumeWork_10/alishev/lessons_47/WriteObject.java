package lessons_47;


import java.io.*;

public class WriteObject  {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/hillel/homeWork/homeWork_10/alishev/lesson47/people.bin"))){
            objectOutputStream.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
