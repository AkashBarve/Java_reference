import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] ip = new int[] {5,3,7,9,1,2,46,16};
        int h = ip.length - 1;
        int[] mergearr = ip;
        mergesort(mergearr, 0, h);
        System.out.println(Arrays.toString(mergearr));
        quicksort(ip, 0, h);
        //quicksort(ip, 0, h);
        System.out.println(Arrays.toString(ip));
    }
    public static void quicksort(int[] ip, int l, int h) {
        int index = partition(ip, l, h);
        if(l < index - 1) {
            quicksort(ip, l, index - 1);
        }
        if(index < h) {
            quicksort(ip, index, h);
        }
    }
    public static int partition(int[] ip, int l, int h) {
        int pivot = ip[(l+h)/2];
        while(l <= h) {
            while(ip[l] < pivot)
                l++;
            while(ip[h] > pivot)
                h--;
            if(l <= h) {
                int temp = ip[l];
                ip[l] = ip[h];
                ip[h] = temp;
                l++;
                h--;
            }
        }
        return l;
    }

    public static void mergesort(int[] mergearr, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(mergearr, l, m);
            mergesort(mergearr, m + 1, h);
            merge(mergearr, l, m, h);
        }
    }
    public static void merge(int[] mergearr, int l, int m, int h) {
        int[] ar1 = new int[m-l+1];
        int[] ar2 = new int[h - m];
        for(int i = 0; i < (m-l+1); i++) {
            ar1[i] = mergearr[l+i];
        }
        for(int i = 0; i < (h - m); i++) {
            ar2[i] = mergearr[m+1+i];
        }
        int i = 0, j= 0;
        int k = l;
        while(i < (m-l+1) && j < (h-m)) {
            if(ar1[i] < ar2[j]) {
                mergearr[k] = ar1[i];
                i++;
            }
            else {
                mergearr[k] = ar2[j];
                j++;
            }
            k++;
        }
        int remaining = (m-l+1) - i;
        while(remaining > 0) {
         mergearr[k] = ar1[i];
         k++;
         i++;
         remaining--;
        }
    }
}
