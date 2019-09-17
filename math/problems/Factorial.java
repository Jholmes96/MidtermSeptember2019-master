package math.problems;

public class Factorial {

    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
/*
    static int factorial(int n){
        if (n ==0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {

        int i, fact = 1;
        int number = 8;
        fact = factorial(number);
        System.out.println("Factorial of " + number + "!  =" + fact);
    }
*/
    public static long factorial(int z) {
        long fact = 1;

        for (int i = 1; i <=z; i++)
            fact = fact * i;

        return fact;
    }

    public static void main(String[] args) {
        int z = 7;
        System.out.println("Factorial of "+z+"! = "+ factorial(z));
    }




}
