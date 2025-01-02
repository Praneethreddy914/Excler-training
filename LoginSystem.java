import java.util.Scanner;
public class LoginSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "user000";
        String correctPassword = "user_000";
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
        scanner.close();
    }
}
