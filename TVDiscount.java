import java.util.Scanner;

public class TVDiscount {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int testcases = obj.nextInt();
            int x = 0;
            int y = 0;
            int[] values = new int[4];
            for (int i = 0; i < testcases; i++) {
                for (int j = 0; j < values.length; j++) {
                    values[j] = obj.nextInt();
                    x = values[0] - values[2];
                    y = values[1] - values[3];
                }
                if(x < y){
                    System.out.println("First");
                }
                else if(x > y){
                    System.out.println("Second");
                }
                else{
                    System.out.println("Any");
                }
            }
        }
    }
}
