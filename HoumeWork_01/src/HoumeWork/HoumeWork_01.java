package HoumeWork;

import java.util.Scanner;

class Bet {
    private int bet;

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bet bet1 = (Bet) o;

        return bet == bet1.bet;
    }

    @Override
    public int hashCode() {
        return bet;
    }

    @Override
    public String toString() {
        return "Bet = " + bet +
                ' ';
    }
}

public class HoumeWork_01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Bet bet = new Bet();

        System.out.println("Введите Вашу ставку:");
        bet.setBet(scanner.nextInt());
        System.out.println("Ставка " + bet.getBet() + "принята");

    }
}