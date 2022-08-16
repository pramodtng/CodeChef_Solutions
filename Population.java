import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testCases = obj.nextInt();
            int ans = 0;
            int[] values= new int[3];
            for (int i = 0; i < testCases; i++) {
               for(int j= 0; j<values.length; j++) {
                   values[j] = obj.nextInt();
                   ans = values[0] - values[1] + values[2];
               }
               System.out.println(ans);
            }
        }
    }
}