import java.util.HashSet;
import java.util.Set;

public class ConsecutiveIntegersDistinctPrimeFactors {
    public static void main(String[] args) {
        int consecutiveCount = 0;
        int currentNumber = 1;

        while (consecutiveCount < 4) {
            if (hasDistinctPrimeFactors(currentNumber, 4)) {
                consecutiveCount++;
                if (consecutiveCount == 4) {
                    System.out.println("The first of the four consecutive integers is: " + (currentNumber - 3));
                }
            } else {
                consecutiveCount = 0;
            }
            currentNumber++;
        }
    }

    private static boolean hasDistinctPrimeFactors(int number, int distinctFactorCount) {
        int count = 0;
        Set<Integer> factors = new HashSet<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return factors.size() == distinctFactorCount;
    }
}
