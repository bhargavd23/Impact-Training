import java.util.Scanner;

public class ReverseIndex {
    public static int reverse(int num)
    {
        int reverse=0;
        while (num>0)
        {
            int ld = num % 10;
            reverse=(reverse*10)+ld;              
            num = num / 10;              
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number: ");
        System.out.println(reverse(num));
        sc.close();
    }
}
