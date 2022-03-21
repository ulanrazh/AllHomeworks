package homework22;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("Alphabet.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < 26; i++) {
                printWriter.append((char) ('A' + i));
                printWriter.append(" " + (char) ('a' + i) + "\n");
            }
            for (int i = 0; i < 10; i++) {
                printWriter.println(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
