import java.util.Scanner;

public class EqualAB {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testcases = obj.nextInt();
            for (int i = 0; i < testcases; i++) {
                int x = obj.nextInt();
                int y = obj.nextInt();
                int ans = Math.min(x, y);
                ans *= 2;
                if((Math.max(x, y))%ans == 0){
                    System.out.println("Yes");
                }
                else if(x == y) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}
