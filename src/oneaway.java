import java.util.*;
public class oneaway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
        }
        if(b.length() - a.length() <= 1) {
            checkedits(a, b);
        }
        else{
            System.out.println("false");
        }

    }

    private static void checkedits(String a, String b) {
     boolean edit = false;
     int indexa = 0;
     int indexb = 0;
     while((indexa < a.length()) && (indexb < b.length())) {
         //if(a.charAt(indexa) == b.charAt((indexb))) {
           //  indexa += 1;
             //indexb += 1;
         //}
         if(a.charAt(indexa) != b.charAt(indexb)) {
             if (edit) {
                 System.out.println("false");
                 return;
             }
             edit = true;
             if (a.length() == b.length()) {
                 indexa += 1;

             }
         }
             else {
                 indexa += 1;
             }
                indexb++;
         }
        System.out.println("true");
     }
    }
