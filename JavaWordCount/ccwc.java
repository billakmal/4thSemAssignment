package JavaWordCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ccwc {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ccwc <filename>");
            return;
        }

        String filename = args[0];
        int letterCount = countLettersFromFile(filename);

        if (letterCount != -1) {
            System.out.println("Number of letters in " + filename + ": " + letterCount);
        } else {
            System.out.println("Error: Couldn't read file " + filename);
        }
    }

    public static int countLettersFromFile(String filename) {
        int letterCount = 0;
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letterCount++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + e.getMessage());
            return -1;
        }

        return letterCount;
    }
}