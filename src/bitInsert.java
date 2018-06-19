public class bitInsert {
    public static void main(String[] args) {
        int m = 19;
        int n = 1024;
        int i = 2;
        int j = 6;
        System.out.println(update(n, m, i, j));
    }
    public static int update(int n, int m, int i, int j) {
        int allones = ~0;
        int left = allones << (j + 1);
        int right = ((1 << i) - 1);
        int mask = left | right;
        n = n & mask;
        m = m << i;
        return m | n;

    }
}
