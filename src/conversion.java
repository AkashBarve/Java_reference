public class conversion {
    public static void main(String[] args) {
        int a = 29;
        int b = 15;
        int count = 0;
        int c = a ^ b;
        while (c != 0) {
            count += (c & 1);
            c >>= 1;
        }
        System.out.println(count);
        int d = a ^ b;
        int con = 0;
        while(d != 0) {
            con ++;
            d = d & (d-1);
        }
        System.out.println(con);
    }
}
