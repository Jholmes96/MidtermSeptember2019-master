package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int a[] = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int sum = 0;
        for (int i=0; i< a.length; i++) {
            sum = sum +a[i];
        }
        System.out.print(sum);

        int sum1 = 0;
        for(int j=1; j<=10; j++){
            sum1 = sum1 + j;
        }
        System.out.println(sum1);

        System.out.println("Missing number is: "+ (sum1-sum));

    }
}
