import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Replace test = new Replace();
        MyFile myFile = new MyFile();

        System.out.println("Заменяем все предлоги в тексте считаном из файла \"input.txt\"");
        String input = myFile.readFromFile();
        System.out.println("\nПервоначальный текст:\n" + input);
        String output = test.replace(input);
        System.out.println("\nТекст после обработки:\n" + test.replacePrint(input));
        myFile.writeToFile(output);
    }
}
