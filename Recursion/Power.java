public class Power {

    public static void main(String[] args) {

        System.out.println(fun(3, 3));
    }

    public static int fun(int n, int p) {
        if(p == 1) {
            return n;
        } else {
            return n * fun(n, p-1);
        }
    }
}
