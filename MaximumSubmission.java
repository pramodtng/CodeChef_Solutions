import java.util.Scanner;

public class MaximumSubmission {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testCases = obj.nextInt();
            int ans = 0;
            int[] values = new int[testCases];
            for(int i=0;i<testCases;i++){
                values[i] = obj.nextInt();
                ans = (values[i] * 60) / 30;
                System.out.println(ans);
            }
        }
    }
}
