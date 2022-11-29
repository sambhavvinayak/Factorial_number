import java.util.Scanner;

/**
 * project2
 * It is for find the factorial number 
 */
public class project2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input you number here.
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        int factorial = 1;

        // loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        // output
        System.out.println("factorial of number :"+factorial);
        // end of code ...
    }
}
