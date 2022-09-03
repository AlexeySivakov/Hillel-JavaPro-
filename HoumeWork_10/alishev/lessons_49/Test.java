package lessons_49;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
    public static int fac(int n){
        if (n == 1) return 1;
        return n * fac(n-1);
    }
}
