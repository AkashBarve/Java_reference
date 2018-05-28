import java.util.LinkedList;

public class graph {
    private int node;
    private LinkedList<Integer> adj[];
    public graph(int node) {
        this.node = node;
        adj = new LinkedList[node];
        for(int i = 0; i < node; ++i) {
            adj[i] = new LinkedList();
        }
    }
    void addedge(int node1, int node2) {
        adj[node1].add(node2);
    }
    boolean isReachable(int s, int t) {
        boolean[] visited = new boolean[node];
        if(s == t) {
            return true;
        }
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()) {
            s = queue.removeFirst();
            //int n;
            //if(s!=null)
                for (int n : adj[s]) {
                if (!visited[n]) {
                    if (n == t) {
                        return true;
                    } else {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        graph g = new graph(4);
        g.addedge(0,1);
        g.addedge(0,2);
        g.addedge(1,2);
        g.addedge(2, 0);
        g.addedge(2,3);
        g.addedge(3,3);
        int u = 1;
        int v = 3;
        if(g.isReachable(u, v)) {
            System.out.println("true");
        }
        else
            System.out.println("false");
        if(g.isReachable(0,3)) {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}

