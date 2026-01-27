import java.util.Scanner;

public class SumUsingBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        while (true) {
            double n = sc.nextDouble();
            if (n <= 0)
                break;
            sum += n;
        }

        System.out.println("Total = " + sum);
    }
}