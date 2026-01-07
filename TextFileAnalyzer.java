import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter word to search: ");
        String searchWord = sc.nextLine().toLowerCase();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        int searchCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    if (word.toLowerCase().equals(searchWord)) {
                        searchCount++;
                    }
                }
            }

            System.out.println("\n--- File Analysis Result ---");
            System.out.println("Lines       : " + lineCount);
            System.out.println("Words       : " + wordCount);
            System.out.println("Characters  : " + charCount);
            System.out.println("Occurrences of '" + searchWord + "': " + searchCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
