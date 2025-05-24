import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[])
    {
        System.out.print("Enter the Number :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++)
        {
            System.out.print("* ");
        }System.out.println();
        for(int i=1; i<n;i++)
        {
            for(int j=i;j<n-2;j++)
            {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("* ");
        }
    }
}