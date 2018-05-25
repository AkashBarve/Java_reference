import java.util.*;
public class urlify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to urlify:");
        String st = sc.nextLine();
        sc.close();
        char[] star = st.toCharArray();
        int increment = 0;
        for(int i = 0; i < st.length(); i++) {
            if(star[i] == ' ') {
                increment += 2;
            }
        }

        //char[] star = st.toCharArray();
        //for(int i = 0; i< st.length(); i++) {
            //if (st.charAt(i) == ' ') {
               // st.replace('a', '%');
            //}
        //}
        System.out.println(st.replace(" ", "%20"));
        return;
    }
}
