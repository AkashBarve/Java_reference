import java.util.ArrayList;

public class java8tests {
    public static void main(String[] args) {
        java8tests tester = new java8tests();
        MathOp add = (int a, int b) -> a+b;
        System.out.println(tester.operate(10,5,add));
        MathOp sub = (a, b) -> a-b;
        System.out.println(tester.operate(10,5,sub));
        MathOp mul = (a,b) -> {
            return a*b;
        };
        System.out.println(tester.operate(10,5, mul));
        MathOp div = (a,b) -> a/b;
        System.out.println(tester.operate(10,5,div));

        Greet hello = message -> System.out.println("hello " + message);
        hello.say("AKASH");
        Greet bye = message -> System.out.println("bye " + message);
        bye.say("AKASH");

        ArrayList<String> names = new ArrayList<>();
        names.add("Sandy");
        names.add("Prateek");
        names.forEach(System.out::println);
        //System.out::println(names.size());
    }
    interface Greet {
        void say(String message);
    }

    interface MathOp {
        int operation(int a, int b);
    }
    private int operate(int a, int b, MathOp mathOp) {
        return mathOp.operation(a,b);
    }
}
