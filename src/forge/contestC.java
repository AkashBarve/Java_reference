package forge;
//FizzBuzz problem
import java.io.IOException;
import java.util.Scanner;

public class contestC {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        for(int i = 1; i <= z; i++) {
            if(i%x == 0 && i%y == 0)
                System.out.println("FizzBuzz");
            else if(i%x == 0)
                System.out.println("Fizz");
            else if(i%y == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
