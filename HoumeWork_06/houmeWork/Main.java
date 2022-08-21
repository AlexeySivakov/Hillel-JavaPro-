package houmeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Car> myСarCollection = new ArrayList<>();
        myСarCollection.add(new Car("PEUGEOT 208", 5.9, 649700));
        myСarCollection.add(new Car("PEUGEOT 2008", 6, 878400));
        myСarCollection.add(new Car("PEUGEOT 301", 7.4, 661000));
        myСarCollection.add(new Car("PEUGEOT 3008", 1.5, 1175100));
        myСarCollection.add(new Car("PEUGEOT 508", 7, 963300));
        myСarCollection.add(new Car("PEUGEOT 5008", 7.2, 942600));
        myСarCollection.add(new Car("PEUGEOT RIFTER", 5.1, 548100));
        myСarCollection.add(new Car("PEUGEOT EXPERT", 8.1, 820000));
        myСarCollection.add(new Car("PEUGEOT PARTNER", 7.1, 554400));
        myСarCollection.add(new Car("PEUGEOT BOXER", 8.4, 1116900));
        System.out.println("Віводим содержимое используя iterator:");
        Iterator<Car> carIterator = myСarCollection.iterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }
        Object[] cars = myСarCollection.toArray();
        System.out.println("По расходу:");
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        System.out.println("По Цене:");
        Arrays.sort(cars, new MyComparatorByСost());
        System.out.println(Arrays.toString(cars));
    }
}
