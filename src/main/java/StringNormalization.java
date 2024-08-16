import java.util.Scanner;

public class ChuanHoaKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự bất kỳ: ");
        String input = scanner.nextLine();

        String normalizedString = normalizeString(input);

        int wordCount = countWords(normalizedString);

        boolean isPalindrome = checkPalindrome(normalizedString);

        System.out.println(normalizedString);
        System.out.println(wordCount + " từ");
        System.out.println(isPalindrome ? "Đối xứng" : "Không đối xứng");
    }

    private static String normalizeString(String input) {
        String cleanedString = input.replaceAll("[^a-zA-Z ]", "");
        String[] words = cleanedString.trim().split("\\s+");
        StringBuilder normalizedString = new StringBuilder();
        for (String word : words) {
            normalizedString.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        return normalizedString.toString().trim();
    }

    private static int countWords(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        return input.split("\\s+").length;
    }

    private static boolean checkPalindrome(String input) {
        String processedString = input.replaceAll("\\s+", "").toLowerCase();
        int n = processedString.length();
        for (int i = 0; i < n / 2; i++) {
            if (processedString.charAt(i) != processedString.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
