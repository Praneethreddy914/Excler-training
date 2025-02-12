import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is not empty
        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Get the first character of the string
            char firstChar = input.charAt(0);

            // Check if the first character is a letter
            if (Character.isLetter(firstChar)) {
                // Convert to lowercase for easy comparison
                firstChar = Character.toLowerCase(firstChar);

                // Check if it's a vowel
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                    System.out.println("The first character is a vowel.");
                } else {
                    System.out.println("The first character is a consonant.");
                }
            } else {
                System.out.println("The first character is not a letter.");
            }
        }

        // Close scanner
        scanner.close();
    }
}
