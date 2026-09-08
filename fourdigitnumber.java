public class fourdigitnumber{
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;

        System.out.println("Sum = " + sum);
    }
}