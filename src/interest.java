import java.text.DecimalFormat;

public class interest {
    public static void main(String[] args) {
        String s = "6000~6~5";
        String[] input = s.split("~");
        int p = Integer.parseInt(input[0]);
        double r = Double.parseDouble(input[1]);
        int t = Integer.parseInt(input[2]);
        r = r/1200;
        double monthly = p * r/(1 - 1/Math.pow(1+r,t*12));
        //DecimalFormat df = new DecimalFormat(".##");
        System.out.println(String.format("%.2f",Math.ceil(monthly)));
        System.out.println((int)Math.floor(monthly*12*t));
    }
}
