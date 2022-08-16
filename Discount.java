import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int testCases = obj.nextInt();
        getAnswer(testCases, obj);
    }

    private static void getAnswer(int testCases, Scanner obj) {
        for(int i = 0; i < testCases; i++) {
            int x = obj.nextInt();
            int ans = 100 - x;
            System.out.println(ans);
        }
    }
}
