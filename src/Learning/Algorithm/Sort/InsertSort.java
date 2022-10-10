package Learning.Algorithm.Sort;

import java.util.Arrays;

public class InsertSort {
    private InsertSort(){}

    private static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }

    public static <E extends Comparable<E>> void  sort(E[] arr){
        for(int i = 0;i< arr.length;i++){
//            将arr[i]插入到合适位置
            E t = arr[i];
            int j;
            for(j = i; j > 0 && t.compareTo(arr[j - 1]) < 0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = t;
        }
    }

    public static <E extends Comparable<E>> void sort(E[] arr,int l, int r){
        for(int i = l;i<= r ;i++){
//            将arr[i]插入到合适位置
            E t = arr[i];
            int j;
            for(j = i; j > l && t.compareTo(arr[j - 1]) < 0;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = t;
        }
    }

    public static <E extends Comparable<E>> void  sortWards(E[] arr){
        for(int i = arr.length -1;i >= 0;i--){
//            将arr[i]插入到合适位置
            E t = arr[i];
            int j;
            for(j = i; j + 1 <arr.length && t.compareTo(arr[j + 1]) > 0;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args){
        int [] dataSize = {10000,100000};
        for(int n : dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n,n);
            Integer[] arr2 = Arrays.copyOf(arr,arr.length);
            SortingHelper.sortTest("SelectionSort",arr);
            SortingHelper.sortTest("InsertionSort",arr2);}

    }


}
