import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class bank {
    public static void main(String[] args) {
        String line = "Go,Bond,5,10,0|FB,Stock,5,10,1:Go,Bond,4,10,0|FB,Stock,6,10,1";
        String[] separate = line.split(":");
        String[] portfolios = separate[0].split("\\|");
        String[] benchmarks = separate[1].split("\\|");
        HashMap<String, ArrayList<String>> portfolio = new HashMap<>();
        HashMap<String, ArrayList<String>> benchmark = new HashMap<>();
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i< portfolios.length; i++) {
            //System.out.println(portfolios[i]);
            String[] p = portfolios[i].split(",");
            //System.out.println(p[0]);
            s1 += (Integer.parseInt(p[2]) * (Integer.parseInt(p[3]) + Integer.parseInt(p[4])));
            ArrayList<String> list = new ArrayList<>();
            for(int j = 1; j < p.length; j++) {
                //System.out.println(p[j]);
                list.add(p[j]);
            }
            portfolio.put(p[0],list);
        }

        for(int i = 0; i< benchmarks.length; i++) {
            String[] b = benchmarks[i].split(",");
            s2 += (Integer.parseInt(b[2]) * (Integer.parseInt(b[3]) + Integer.parseInt(b[4])));
            ArrayList<String> list = new ArrayList<>();
            for(int j = 1; j < b.length; j++) {
                list.add(b[j]);
            }
            benchmark.put(b[0],list);
        }
        //System.out.println(s1);
        ArrayList<String> res = new ArrayList<>();
        for(String key : portfolio.keySet()) {
            compare(portfolio, benchmark, key, s1, s2, res);
        }
    }
    public static void compare(HashMap<String,ArrayList<String>> portfolio, HashMap<String,ArrayList<String>> benchmark, String key, int s1, int s2, ArrayList<String> res) {
        ArrayList<String> port = portfolio.get(key);
        String ptype = port.get(0);
        int n = Integer.parseInt(port.get(1));
        //System.out.println(n);
        int r = Integer.parseInt(port.get(2));
        int a = Integer.parseInt(port.get(3));
        int assetvalp = calcperc(n,r,a,s1);
        ArrayList<String> bench = benchmark.get(key);
        String btype = bench.get(0);
        int n1 = Integer.parseInt(bench.get(1));
        int r1 = Integer.parseInt(bench.get(2));
        int a1 = Integer.parseInt(bench.get(3));
        int assetvalb = calcperc(n1,r1,a1,s2);
        StringBuilder sb = new StringBuilder();
        //System.out.println(assetvalp);
        if(assetvalp > assetvalb) {
            sb.append(key+",SELL");
           // System.out.println(sb.toString());
        }

    }
    public static int calcperc(int n, int r, int a, int s) {
        System.out.println(n*((r+a)/s));
        return n*((r+a)/s);
    }

}
