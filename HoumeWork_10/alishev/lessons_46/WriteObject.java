package lessons_46;


import java.io.*;

public class WriteObject  {
    public static void main(String[] args) {
        Person [] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("lessons_46/People.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);
            //oos.writeInt(people.length);
            //for (Person person : people){
            //    oos.writeObject(person);
            //}

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
