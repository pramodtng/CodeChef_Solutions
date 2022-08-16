import java.util.Scanner;

public class NearestCourt {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testCases = obj.nextInt();
            for(int i = 0; i< testCases; i++) {
                int x = obj.nextInt();
                int y = obj.nextInt();
                int z = (x+y)/2;
                int ans1 = Math.abs(x-z);
                int ans2 = Math.abs(y-z);
                System.out.println(Math.max(ans1, ans2));
            }
        }
    }
}
