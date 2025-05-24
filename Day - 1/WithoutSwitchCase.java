import java.util.Scanner;
public class WithoutSwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0) {
            if (n == 1) {
                System.out.println("Monday");
                break;
            }
            else if (n == 2) {
                System.out.println("Tuesday");
                break;
            }
            else if (n == 3) {
                System.out.println("Wednesday");
                break;
            }
            else if (n == 4) {
                System.out.println("Thusday");
                break;
            }
            else if (n == 5) {
                System.out.println("Friday");
                break;
            }
            else if (n == 6) {
                System.out.println("Saturday");
                break;
            }
            else if (n == 7) {
                System.out.println("Sunday");
                break;
            }
            else {
                System.out.println("Please Enter Valid Number");
            }
        }
    }
}


