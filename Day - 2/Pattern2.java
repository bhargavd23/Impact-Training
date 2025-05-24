import java.util.Scanner;
public class Pattern2 {
    public static void main1(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter The Number:- ");
        for (int i = n;i>=1;i--) {
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = sc.nextInt();
        
        if (val<=n || val%n ==1 || val%n == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}