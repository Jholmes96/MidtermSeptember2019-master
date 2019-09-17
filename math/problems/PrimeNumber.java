package math.problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        Scanner s = new Scanner(System.in);
        System.out.println("first number");
        int start = s.nextInt(2);
        System.out.println("second number");
        int end =  s.nextInt(1000000);
        System.out.println("list of prime numbers between" + start+  "and" + end);
        for (int i = start; i<= end; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(n);i++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
}
