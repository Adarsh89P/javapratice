import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the right-angled triangle:");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
    
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}