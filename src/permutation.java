import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        if(A.length() != B.length()) {
            System.out.println("not a permutation");
            return;
        }
        sc.close();
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        Map<Character, Integer> dict = new HashMap<Character, Integer>();
        for(int i = 0; i < charA.length; i++) {
            int count = 1;
            if (!dict.containsKey(charA[i])) {
                dict.put(charA[i], count);
            } else {
                count = dict.get(charA[i]);
                dict.put(charA[i], count + 1);
            }
        }
        for(int i = 0; i < charB.length; i++) {
            if(!dict.containsKey(charB[i])) {
                System.out.println("not a permutation");
                return;
            }
            else {
                int c = dict.get(charB[i]);
                if(c != 1) {
                    dict.put(charB[i], c - 1);
                }
                else {
                    dict.remove(charB[i]);
                }
            }
        }
        if(dict.isEmpty()) {
            System.out.println("is a permutation");
        }
        else {
            System.out.println("not a permutation");
        }
        return;
    }
}
