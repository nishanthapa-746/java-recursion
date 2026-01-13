public class fibona {
    public static void main(String args[]) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        //since we already print first two number so we are sending n-2
        fib(a, b, n - 2);

    }

    public static void fib(int a, int b, int n) {
        //always make sure to set the base.
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c+" ");

        //replacing the value so that next iteration is done.
        fib(b, c, n - 1);

    }
}