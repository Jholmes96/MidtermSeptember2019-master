package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
        int n, a = 0, b = 0, c = 1;
        System.out.println("The First 40 Numbers");
        for(int i = 1; i <= 40; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a+" ");
        }
    }
}
