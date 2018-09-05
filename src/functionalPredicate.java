import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class functionalPredicate {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("All numbers");
        eval(list, n -> true);

        System.out.println("\nEven nos");
        eval(list, n -> n%2 == 0);

        System.out.println("\nbetween 3 and 8");
        eval(list, n -> n > 3 && n<8);

    }
    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(int n : list) {
            if(predicate.test(n)) {
                System.out.print(n);
            }
        }
    }
}
