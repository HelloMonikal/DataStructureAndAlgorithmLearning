package Learning.Algorithm.Sort;

public class QuickSort   {
    private QuickSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){




    }

    private static <E extends Comparable<E>> int partition(E[] arr,int l, int r){
        int j = l;
        for(int i = l +1; i <= r; i++ ){
            if(arr[i].compareTo(arr[l]) < 0){
                j ++;
                swap(arr,i,j);
            }

        }
        swap(arr, l ,j);
        return  j;
    }


    private static  <E> void swap(E[] arr, int i, int j){

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }



}
