package HomeWork;

import java.util.ArrayList;

public class Storage {
    ArrayList<Bet> betArrayList = new ArrayList<>();

    public void add(Object a) {
        betArrayList.add((Bet) a);
    }

    public void print() {
        System.out.println("История ставок за сеанс:");
        System.out.println();
        System.out.println(betArrayList);
    }


}
