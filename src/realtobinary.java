public class realtobinary {
    public static void main(String[] args) {
        double n = 0.72;
        System.out.println(printBin(n));
    }
    public static String printBin(double n) {
        if(n >= 1 || n <= 0)
            return "ERROR";
        StringBuilder str = new StringBuilder();
        str.append(".");
        while(n > 0) {
            if (str.length() >= 32)
                return "ERROR";
            double r = n * 2;
            if(r >= 1) {
                str.append(1);
                n = r - 1;
            }
            else {
                str.append(0);
                n = r;
            }
        }
        return str.toString();
    }
}
