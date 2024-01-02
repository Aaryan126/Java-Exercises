public class revNum {

    public static void main(String[] args) {

        int res = Integer.parseInt(fun(1341234));
        System.out.println(res);

    }

    public static String fun(int n) {
        if(n < 10) {
            return Integer.toString(n);
        } else {
            return n % 10 + fun(n/10);
        }
    }
}
