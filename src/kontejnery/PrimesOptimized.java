package kontejnery;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimesOptimized {
    public static void main(String[] args) {
        System.out.println("Zadejte počet prvočísel");
        int n = new Scanner(System.in).nextInt();
        ArrayList<Integer> primes = new ArrayList<>();

        for (int checked = 2; primes.size() < n; checked++) {
            boolean isPrime = true;
            int sqrt = (int) Math.floor(Math.sqrt(checked));
            for (int divisor : primes) {
                if(divisor > sqrt) break;
                if (checked % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(checked);
        }

        System.out.println(primes);
    }
}