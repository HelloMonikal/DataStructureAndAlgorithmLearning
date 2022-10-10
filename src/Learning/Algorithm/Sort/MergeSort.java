package Learning.Algorithm.Sort;
import java.util.Arrays;

public class MergeSort {
    private MergeSort() {}


    public static <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr,arr.length);
        sort(arr,0, arr.length-1,temp);

    }
    private static<E extends Comparable<E>> void sort(E[]arr,int l,int r,E[] temp){
        if(l >= r) return;

        int mid = l + (r - l) /2;
        sort(arr,l ,mid,temp);
        sort(arr,mid+1,r,temp);
//        if(arr[mid].compareTo(arr[mid + 1]) > 0 )
            merge(arr,l,mid,r,temp);
    }

    public static <E extends Comparable<E>> void sortBU(E[] arr){
        E[] temp = Arrays.copyOf(arr,arr.length);
        int n = arr.length;
//        合并的区间长度
        for(int sz = 1; sz < n; sz += sz ){
//            遍历合并的两个区间的起始位置
            for(int i = 0;i + sz < n ;i += sz + sz){
                if(arr[i + sz - 1].compareTo(arr[i +sz])>0)
                    merge(arr,i,i+sz-1,Math.min(i+sz+sz-1, n-1),temp);}
        }
    }
    //    合并两个有序区间 arr[l,mid]  arr[mid+1,r]
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r,E[] temp) {

        System.arraycopy(arr,l,temp,l,r-l+1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                arr[k] = temp[i];
                i++;
            } else if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k] = temp[i]; i ++;
            } else if (temp[i].compareTo(temp[j]) > 0) {
                arr[k] = temp[j]; j ++;
            }
        }
    }

    private static<E extends Comparable<E>> void sortBias(E[]arr,int l,int r){
        if(l >= r) return;

        int mid = l + (r - l) /2;
        sortBias(arr,l ,mid);
        sortBias(arr,mid+1,r);
//        if(arr[mid].compareTo(arr[mid + 1]) > 0 )
        merge(arr,l,mid,r);
    }

    //    【有偏移量】合并两个有序区间 arr[l,mid]  arr[mid+1,r]
    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
//        System.out.print("左: "+l + "  中：" +mid +"  右：" + r+"\t" );
//        System.out.println(Arrays.toString(temp));
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l]; i ++;
            } else if (temp[i - l].compareTo(temp[j - l]) > 0) {
                arr[k] = temp[j - l]; j ++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] dataSize = {8};
//
//        for(int i = 0;i< dataSize.length;i++){
//            Integer[] arr = ArrayGenerator.generateRandomArray(dataSize[i],dataSize[i]);
//            Integer[] arr1 = Arrays.copyOf(arr,arr.length);
//            Integer[] arr2 = {5,6,8,7,2,6,9};
//            MergeSort.sort(arr2);
//            SortingHelper.sortTest("MergeSort",arr);
//            SortingHelper.sortTest("MergeSortBU",arr1);
//        Integer[] arr = {6, 3, 6, 5, 6, 8, 4, 7, 4, 2, 6};
        Integer[] arr = ArrayGenerator.generateRandomArray(100000000,100000000);

        long t1 = System.nanoTime();
        MergeSort.sortBias(arr,0,arr.length-1);
        long t2 = System.nanoTime();

        System.out.println("亿规模:"+(t2-t1)/1e9 +"s") ;
//        System.out.println(Arrays.toString(arr));

        }


    }



