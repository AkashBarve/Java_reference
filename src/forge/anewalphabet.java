package forge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//A new alphabet problem katiss
public class anewalphabet {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, String> d = new HashMap<>();
        d.put('a',"@");
        d.put('b',"8");
        d.put('c',"(");
        d.put('d',"|)");
        d.put('e',"3");
        d.put('f',"#");
        d.put('g',"6");
        d.put('h',"[-]");
        d.put('i',"|");
        d.put('j',"_|");
        d.put('k',"|<");
        d.put('l',"1");
        d.put('m',"[]\\/[]");
        d.put('n',"[]\\[]");
        d.put('o',"0");
        d.put('p',"|D");
        d.put('q',"(,)");
        d.put('r',"|Z");
        d.put('s',"$");
        d.put('t',"']['");
        d.put('u',"|_|");
        d.put('v',"\\/");
        d.put('w',"\\/\\/");
        d.put('x',"}{");
        d.put('y',"`/");
        d.put('z',"2");
        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(d.containsKey(input.charAt(i))) {
                sb.append(d.get(input.charAt(i)));
            }
            else {
                sb.append(input.charAt(i));
            }

        }
        System.out.println(sb.toString());
    }
}
