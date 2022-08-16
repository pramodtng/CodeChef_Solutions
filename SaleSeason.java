import java.util.Scanner;

public class SaleSeason {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testCases = obj.nextInt();
            int[] values = new int[testCases];
            for (int i = 0; i < testCases; i++) {
                values[i] = obj.nextInt();
                int ans = values[i] - 25;
                int ans1 = values[i] - 100;
                int ans2 = values[i] - 500;
                if (values[i] > 5000) {
                    System.out.println(ans2);
                } else if (values[i] <= 5000 && values[i] > 1000) {
                    System.out.println(ans1);
                } else if (values[i] <= 1000 && values[i] > 100) {
                    System.out.println(ans);
                } else {
                    System.out.println(values[i]);
                }
            }
        }
    }
}
