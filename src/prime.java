public class prime {
    public static void main(String[] args) {


        int num = 11, count = 0, i;
        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count = count + i;
            }
            if (count == 2)
                System.out.println("prime number");
            else
                System.out.println("not a prime ");
        }
    }
}
