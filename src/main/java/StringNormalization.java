import java.util.Scanner;

public class StringNormalization {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the String: ");
        String input = scanner.nextLine();

        String removedChar = input.replaceAll("[^a-zA-Z\\s]", "").trim();

        removedChar = removedChar.replaceAll("\\s+", " ");

        String[] words = removedChar.split(" ");
        StringBuilder capitalizedLetter = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedLetter.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        String finalWord = capitalizedLetter.toString().trim();

        int wordCount = finalWord.isEmpty() ? 0 : finalWord.split(" ").length;

        String reversedString = new StringBuilder(finalWord).reverse().toString();
        boolean isPalindrome = finalWord.equalsIgnoreCase(reversedString);

        System.out.println("String after normalizing: " + finalWord);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Is this string a palindrome ?" + (isPalindrome ? "Yes" : "No"));
    }
}
