import java.util.ArrayList;
import java.util.List;

public class LongestConsecutivePrimeSum {
    public static void main(String[] args) {
        int limit = 1000000;
        int result = findLongestSumOfConsecutivePrimes(limit);
        System.out.println("The prime below one million that can be written as the sum of the most consecutive primes: " + result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findLongestSumOfConsecutivePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int num = 3; num < limit; num += 2) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        int maxLength = 0;
        int maxPrime = 0;
        for (int start = 0; start < primes.size(); start++) {
            for (int end = start + maxLength; end < primes.size(); end++) {
                int primeSum = 0;
                for (int i = start; i <= end; i++) {
                    primeSum += primes.get(i);
                }
                if (primeSum >= limit) {
                    break;
                }
                if (primes.contains(primeSum) && end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    maxPrime = primeSum;
                }
            }
        }

        return maxPrime;
    }
}
