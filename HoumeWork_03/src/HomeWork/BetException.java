package HomeWork;

public class BetException extends Exception {
    String text = "Введено некорректное значение! Повторите ввод:";

    @Override
    public String getMessage() {
        return text;
    }
}
