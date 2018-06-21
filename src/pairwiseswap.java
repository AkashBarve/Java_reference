public class pairwiseswap {
    public static void main(String[] args) {
        int d = 60;
        int a = 0xaaaaaaaa;
        int b = 0x55555555;
        int s1 = (d & a) >>> 1;
        int s2 = (d & b) << 1;
        System.out.println(s1 | s2);
    }
}
