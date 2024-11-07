import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");

        int fact = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("factorial of the Number:: " + fact);

    }

}
