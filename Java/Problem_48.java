public class LastTenDigitsSeries {
    public static void main(String[] args) {
        long sum = 0;
        long modulo = 10000000000L; // 10^10

        for (int i = 1; i <= 1000; i++) {
            long term = 1;

            for (int j = 1; j <= i; j++) {
                term = (term * i) % modulo;
            }

            sum = (sum + term) % modulo;
        }

        System.out.println("The last ten digits of the series is: " + sum);
    }
}
