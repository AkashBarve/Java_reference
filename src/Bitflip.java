public class Bitflip {
    public static void main(String[] args) {
        int n = 1775;
        System.out.println(flip(n));
    }
    public static int flip(int n) {
        if (~n == 0) {
            return Integer.BYTES * 8;
        }
        int prev = 0;
        int current = 0;
        int max = 1;
        while(n != 0) {
            if((n & 1) == 1) {
                current++;
            }
            else if((n & 1) == 0) {
                if((n & 2) == 0) {
                    prev = 0;
                    current = 0;
                }
                else {
                    prev = current;
                    current = 0;
                }
            }
            max = Math.max(prev + current + 1, max);
            n >>>= 1;
        }
        return max;
    }
}
