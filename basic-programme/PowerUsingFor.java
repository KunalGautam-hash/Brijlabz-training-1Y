public class PowerUsingFor {
    public static void main(String[] args) {
        int num = 2, power = 5, result = 1;
        for (int i = 1; i <= power; i++)
            result *= num;
        System.out.println(result);
    }
}