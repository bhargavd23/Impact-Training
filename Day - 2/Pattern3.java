import java.util.Scanner;
public class Pattern3 {
    public static void main1(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2;i<=n; i++) {
            for(int j = 1 ;j<=(2*i - 1);j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main2(String args[]) {
        int n = 5;
        if (n == 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // (Condition) ? statment 1 : statement 2;--> syntax
        String res = (n == 5) ? "Yes" : "No";
        System.out.println(res);
    }
    public static void main3(String args[]) {
        String name = "Bhargav";
        String res = (name == "Bhargav" ) ? name : "nothing";
        System.out.println(res);
    }
    public static void main4(String args[]) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        for (int i:arr){
            System.out.println(i);
        } 
    }

    // Diamond Pattern //
    public static void main5(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hourglass Pattern //

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
