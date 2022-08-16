import java.util.Scanner;

public class Tastiness {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testCases = obj.nextInt();
            for(int i = 0; i < testCases; i++) {
                int a = obj.nextInt();
                int b = obj.nextInt();
                int c = obj.nextInt();
                int d = obj.nextInt();
                int x = Math.max(a, b);
                int y = Math.max(c, d);
                System.out.println(x+y);
            }
        }
    }
}
