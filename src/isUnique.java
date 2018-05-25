import java.util.*;
public class isUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        sc.close();
        char[] ipChar = input.toCharArray();
        Set<Character> ipSet = new HashSet<Character>();
        for(int i = 0; i<ipChar.length; i++) {
            if(!ipSet.add(ipChar[i])){
                System.out.println("not unique");
                return;
            }
        }
        System.out.println("Unique");
        return;
    }
}
