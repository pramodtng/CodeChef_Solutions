import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        checkInsurance(testCases, input);
    }

    private static void checkInsurance(int testCases, Scanner input) {
        for (int i = 0; i < testCases; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x < y) {
                System.out.println(x);
            } else if (x > y) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
    }
}
