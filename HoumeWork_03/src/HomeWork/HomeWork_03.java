package HomeWork;

import HomeWork.Lib.Dao;
import HomeWork.Lib.Inject;

import java.util.Scanner;

@Inject
@Dao
class Bet {
    private int value;
    private double risk = 0;

    public int getValue() {
        return value;

    }

    public void setBet(int value) {
        this.value = value;
        this.risk = calcRisk(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bet bet = (Bet) o;

        if (value != bet.value) return false;
        return Double.compare(bet.risk, risk) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = value;
        temp = Double.doubleToLongBits(risk);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public Object clone() {
        Bet betCopy = new Bet();
        betCopy.risk = this.risk;
        betCopy.value = this.value;
        return betCopy;
    }

    @Override
    public String toString() {
        return "Bet{" + "value=" + value + ", risk=" + risk + '}';
    }

    private double calcRisk(int value) {
        if (value < 10) {
            return 0.01;
        } else {
            if (value < 100) {
                return 0.1;
            } else {
                if (value < 1000) {
                    return 0.5;
                } else {
                    return 1;
                }
            }
        }

    }
}


public class HomeWork_03 {

    public static void main(String[] args) throws Exception {

        boolean flag = false;
        String temp = null;
        String tempSTR;
        int value;
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        Bet bet = new Bet();

        System.out.println("Введите значение ставки:");
        //Считываем данные из консолди через BufferedReader.
        while (true) {

            tempSTR = MyBufferedReader.read();
            try {
                try {
                    if (Integer.parseInt(tempSTR) > 0 && Integer.parseInt(tempSTR) <= Integer.MAX_VALUE) {
                        bet.setBet(Integer.parseInt(tempSTR));
                        storage.add(bet.clone());
                        System.out.println("Ставка " + bet.toString() + " принята.");
                        System.out.println("Введите следующее значение:");
                        System.out.println("(Чтобы выйти из программы введите \"q\")");

                    } else {
                        throw new BetException();
                    }
                } catch (NumberFormatException e) {

                    if (tempSTR.equals("q")) {
                        storage.print();
                        System.out.println("Всего доброго!");
                        break;
                    } else {
                        throw new BetException();
                    }
                }
            } catch (BetException e) {
                System.out.println(e.getMessage());
            }

        }

        //Старый код с использованием сканера.
        /*while (true) {
            try {
                if (scanner.hasNextInt()) {
                    try {
                        int value = Integer.parseInt(scanner.nextLine());
                        if (value > 0) {
                            bet.setBet(value);
                            storage.add(bet.clone());
                        } else {
                            throw new BetException();
                        }

                    } catch (NumberFormatException e) {
                        throw new BetException();
                    }
                    System.out.println("Ставка " + bet.toString() + " принята.");
                    System.out.println("Введите следующее значение:");
                    System.out.println("(Чтобы выйти из программы введите \"q\")");
                } else {
                    if (scanner.nextLine().equals("q")) {
                        storage.print();
                        System.out.println("Всего доброго!");
                        break;
                    } else {
                        throw new BetException();
                    }
                }
            } catch (BetException e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}


