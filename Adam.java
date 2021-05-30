// Java program to find Adam numbers in the given range
import java.io.*;
 
public class Adam {
 
    public static int reverse(int a)
    {
        int rev = 0;
        while (a != 0) {
            int r = a % 10;
 

            rev = rev * 10 + r;
            a = a / 10;
        }
        return (rev);
    }
 

    public static int adam(int a)
    {
        int r1 = reverse(a);
 
        int s1 = a * a;
 
        int s2 = r1 * r1;
 
        int r2 = reverse(s2);
 
        if (s1 == r2) {
            return (1);
        }
        else {
            return (0);
        }
    }

    public static void find(int m, int n)
    {
 
        if (m > n) {
            System.out.println(" INVALID INPUT ");
        }
        else {
 
            int c = 0;
 
            for (int i = m; i <= n; i++) {
 
                int k = adam(i);
                if (k == 1) {
                    
                    System.out.print(i + "\t");
                }
            }
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int L = 0, R = 100;
        System.out.println("Adam Numbers In The Given Range Are: ");
        find(L, R);
    }
}