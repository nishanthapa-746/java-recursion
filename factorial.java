public class factorial {
    public static void main(String[] args) {
        int n=5;
        int ans = fact(n);
        System.out.print(ans);
    }

    public static int fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_1 = fact(n - 1);
        int fact_2 = n * fact_1;
        return fact_2;

    }
}