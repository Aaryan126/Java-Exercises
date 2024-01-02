public class Countdown {

    public static void main(String[] args) {

        fun(3);

    }

    public static int fun (int n) {
        if(n == 0) {
            System.out.println(n);
            return 0;
        }
        if(n == 1) {
            System.out.println(n);
            return fun(n-1);
        } else {
            System.out.println(n);
            return fun(n-1);
        }
    }
}
