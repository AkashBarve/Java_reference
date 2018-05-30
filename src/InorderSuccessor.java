public class InorderSuccessor {
    private static class Node {
        int val;
        Node left;
        Node right;
        Node parent;
        public Node(int val, Node parent) {
            this.val = val;
            left = right = null;
            this.parent = parent;
        }
    }
    public static class BinaryTree {
        Node root;
        BinaryTree(int k) {
            root = new Node(k, null);
        }
        BinaryTree() {
            root = null;
        }

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20, null);
        tree.root.left = new Node(8, tree.root);
        tree.root.right = new Node(22, tree.root);
        tree.root.left.left = new Node(4, tree.root.left);
        tree.root.left.right = new Node(12, tree.root.left);
        tree.root.left.right.left = new Node(10, tree.root.left.right);
        tree.root.left.right.right = new Node(14, tree.root.left.right);
        Node successor = InorderSuc(tree.root.left.right.left);
        if(successor != null) {
            System.out.println("Successor = " + successor.val);
        }
        else {
            System.out.println("no successor in order");
        }

    }

    private static Node InorderSuc(Node n) {
        if(n == null)
            return null;
        if(n.right != null) {
            return LeftMost(n.right);
        }
        else {
            Node q = n;
            Node p = q.parent;
            while(p != null && p.left != q) {
                q = p;
                p = q.parent;
            }
            return p;
        }
    }
    private static Node LeftMost(Node n) {
        if(n == null)
            return  null;
        while(n.left != null) {
            n = n.left;
        }
        return n;

    }
}
