/*
---- Natural sum ------

Problem Description
You are given a positive integer 'N' and you are required to implement a recursive function that calculates the sum of the first 'N' natural numbers.

Input format
First line contains an integer - N.

Output format
Print the sum of first N natural numbers.

Sample Input 1
10

Sample Output 1
55

Explanation
1+2+3+4+5+6+7+8+9+10 = 55

Sample Input 2
3

Sample Output 2
6

Explanation
1+2+3 = 6

Constraints
1 <= N <= 10^3
 */

package recursion;
import java.util.*;

public class NaturalSumRecDSA {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = naturalSum(N);
        System.out.println(res);
    }

    static int naturalSum(int N){
        if (N == 0) return N;

        return N + naturalSum(N - 1);
    }
}
