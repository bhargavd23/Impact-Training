import java.util.*;

public class HCFExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF using Euclidean Algorithm
        int hcf = findHCF(num1, num2);

        // Display result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    // Method to find HCF
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
