package collections;

public class Factorial {

    public static void main(String[] args) {

        try {
            System.out.println(factorial_recurse(-5));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }

    public static int factorial_recurse(int n) {
        // base case
        if (n < 0) throw new IllegalArgumentException("Invalid N! (must be positive)");
        if (n == 1) return 1;

        // recursive case
        return n * factorial_recurse(n - 1);
    }

    public static int factorial(int n) {

        if (n < 0) throw new IllegalArgumentException("Invalid N! (must be positive)");

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;


    }
}
