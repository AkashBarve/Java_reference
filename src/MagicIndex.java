import java.util.Scanner;

public class MagicIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findIndex(arr, 0, n-1));
    }
    public static int findIndex(int[] arr, int beg, int end) {
        while(beg<=end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] > mid) {
                return findIndex(arr, beg, mid - 1);
            } else if (arr[mid] < mid) {
                return findIndex(arr, mid + 1, end);
            }
        }
        return -1;
    }

}
