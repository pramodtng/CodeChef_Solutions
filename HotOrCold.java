import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        hotOrCold(testCases, input);
        input.close();
    }

    public static void hotOrCold(int testCases, Scanner input) {
        for(int i = 0; i< testCases; i++){
            int values = input.nextInt();
            if(values <= 20) {
                System.out.println("Cold");
            }
            else{
                System.out.println("Hot");
            }
        }
    }
}