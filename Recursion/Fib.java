public class Fib { // 0 1 1 2 3 5 8

    public static void main(String[] args) {

        System.out.println(fun(7));

    }

    public static int fun(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        } else {
            return fun(n-1) + fun(n-2);
        }
    }
}
