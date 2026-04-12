/*
---- Find the factorial of the number --------

Problem Description
Given a number n, you have to calculate the factorial of that number.

Input format
First line contains an integer - n

Output format
Print the factorial of the given number.

Sample Input 1
3

Sample Output 1
6

Explanation
3! = 3.2.1 = 6

Constraints
0 <= n <= 10
 */

package recursion;
import java.util.*;

public class FactorialDSA {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorialDSA(n);

        System.out.println(result);
    }

    static int factorialDSA(int n){
        if (n == 0 || n == 1) return 1;

        return n * factorialDSA(n - 1);
    }
}
