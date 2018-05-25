import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        isSub(s1, s2);
    }
    public static boolean isSub(String s1, String s2) {
        if(s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        String s3 = s1 + s1;
        if(s3.contains(s2)) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
