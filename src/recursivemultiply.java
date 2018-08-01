import java.util.Scanner;

public class recursivemultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = mult(a,b);
        System.out.println(s);
        int nomemo = nomemo(a,b);
        System.out.println("Without using cache ans is " + nomemo);

    }
    public static int nomemo(int a, int b) {
        int smaller = a<b?a:b;
        int bigger = a>b?a:b;
        return nomemohelper(smaller, bigger);
    }
    public static int nomemohelper(int sm, int bi) {
        if(sm == 0)
            return 0;
        if(sm == 1)
            return bi;
        int half = sm >> 1;
        int halfprod = nomemo(half, bi);
        if(sm%2 == 0)
            return halfprod + halfprod;
        else
            return halfprod + halfprod + bi;
    }
    public static int mult(int a, int b) {
        int smaller = a<b?a:b;
        int bigger = a>b?a:b;
        int[] memo = new int[smaller+1];
        return recmul(smaller, bigger, memo);
    }
    public static int recmul(int smaller, int bigger, int[] memo) {
        if(smaller == 0)
            return 0;
        if(smaller == 1)
            return bigger;
        if(memo[smaller] > 0)
            return memo[smaller];
        int s = smaller >> 1;
        int side1 = mult(s, bigger);
        int side2 = side1;
        if(smaller%2 == 1)
            side2 = recmul(smaller - s, bigger, memo);
        memo[smaller] = side1+side2;
        return memo[smaller];

    }
}
