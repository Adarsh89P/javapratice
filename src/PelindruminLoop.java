import java.util.Scanner;

public class PelindruminLoop {
    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);

        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        return numberStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }


    }
}

