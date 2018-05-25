import java.util.*;
public class palinperm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string");
        String st = sc.nextLine().toLowerCase();
        Set<Character> dict = new HashSet<Character>();
        sc.close();
        char[] input = st.toCharArray();
        for(int i = 0; i < input.length; i++) {
            //int count = 1;
            if(input[i] == ' ') {
                continue;
            }
            if(!dict.contains(input[i])) {
                dict.add(input[i]);
            }
            else {
                dict.remove(input[i]);
            }
        }
        if (dict.size() == 0 | dict.size() == 1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return;
    }
}
