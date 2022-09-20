import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
    String separator = java.io.File.separator;
    String fileInput = "houmeWork_15" + separator + "input.txt";
    String fileOutput = "houmeWork_15" + separator + "output.txt";

    public String readFromFile() throws FileNotFoundException {
        File file = new File(fileInput);
        Scanner scanner = new Scanner(file);
        String line = "";
        while (scanner.hasNextLine()) {
            line = line + "\n" + scanner.nextLine();
        }
        scanner.close();
        return line;
    }

    public boolean writeToFile(String line) throws FileNotFoundException {
        File file = new File(fileInput);
        PrintWriter pw = new PrintWriter(fileOutput);
        pw.println(line);
        pw.close();
        return true;
    }
}
