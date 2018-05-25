import java.util.Scanner;

public class compress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String st = sc.nextLine();
        sc.close();
        StringBuilder comp = new StringBuilder();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            count += 1;
            if (i + 1 >= st.length() || st.charAt(i + 1) != st.charAt(i)) {
                comp.append(st.charAt(i));
                comp.append(count);
                count = 0;
            }
        }
        if (comp.length() < st.length()) {
            System.out.println(comp);
        } else
            System.out.println(st);
        return;
    }
}
