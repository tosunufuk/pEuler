import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimePermutationSequence {
    public static void main(String[] args) {
        List<Integer> primes = generatePrimes(10000); // Generate primes up to 4 digits
        findArithmeticSequence(primes);
    }

    // Generate prime numbers up to a given limit
    private static List<Integer> generatePrimes(int limit) {
        boolean[] isComposite = new boolean[limit];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i < limit; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = 2 * i; j < limit; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return primes;
    }

    // Check if two numbers are permutations of each other
    private static boolean arePermutations(int a, int b) {
        char[] aDigits = String.valueOf(a).toCharArray();
        char[] bDigits = String.valueOf(b).toCharArray();

        Arrays.sort(aDigits);
        Arrays.sort(bDigits);

        return Arrays.equals(aDigits, bDigits);
    }

    // Find arithmetic sequence with prime and permutation properties
    private static void findArithmeticSequence(List<Integer> primes) {
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                int diff = primes.get(j) - primes.get(i);
                int nextTerm = primes.get(j) + diff;

                if (nextTerm < 10000 && primes.contains(nextTerm) && arePermutations(primes.get(i), primes.get(j)) && arePermutations(primes.get(j), nextTerm)) {
                    System.out.println("The 12-digit number formed by concatenating the terms is: " + primes.get(i) + "" + primes.get(j) + "" + nextTerm);
                    return;
                }
            }
        }
    }
}
