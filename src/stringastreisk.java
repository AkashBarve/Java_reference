import java.util.Scanner;

public class stringastreisk {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        if(ip.charAt(0) == '*') {
            ip = (String) ip.subSequence(2, ip.length());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ip.length(); i++) {
            if(ip.charAt(i) != '*') {
                sb.append(ip.charAt(i));

            }
            else {
                sb.deleteCharAt(i-1);
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}
