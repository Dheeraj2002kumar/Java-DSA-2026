package exam;

public class RecursiveFactorial {
    static int fact(int n){
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args){
        System.out.println("factorial of number: \n" + fact(5));
    }
}
