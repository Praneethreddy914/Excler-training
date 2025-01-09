import java.util.Scanner;

public class Demo019{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int roundedNumber = roundToNearestFive(number);
        System.out.println("The number " + number + " rounded to the nearest multiple of 5 is: " + roundedNumber);
    }
  
    public static int roundToNearestFive(int num) {
        int remainder = num % 5;
        if (remainder < 3) {
            return num - remainder;
        } else {
            return num + (5 - remainder);
        }
    }
}
