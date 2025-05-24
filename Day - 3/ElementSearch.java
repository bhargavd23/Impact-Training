import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}
