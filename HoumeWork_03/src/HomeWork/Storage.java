package HomeWork;

import HomeWork.MyArrayList.MyArrayList;

public class Storage {
    MyArrayList<Bet> betArrayList = new MyArrayList<>();
    //ArrayList<Bet> betArrayList = new ArrayList<>();

    public void add(Object a) {
        betArrayList.add((Bet) a);
    }

    public void print() {
        System.out.println("История ставок за сеанс:");
        System.out.println();
        System.out.println(betArrayList);
    }


}
