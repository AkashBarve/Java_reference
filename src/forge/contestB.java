package forge;

import java.io.IOException;
import java.util.Scanner;

public class contestB {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
}
