package Learning.Algorithm.Sort;

public class SortingHelper {
    private SortingHelper(){}

    public static <E extends Comparable<E>>  boolean isSorted(E[] arr) {

        for(int i = 1; i < arr.length; i++)
            if(arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static<E extends Comparable<E>> void sortTest(String sortName,E[] arr){

        long startTime = System.nanoTime();
        switch (sortName) {
            case "SelectionSort":
                SelectSort.sort2(arr);
                break;
            case "InsertionSort":
                InsertSort.sort(arr);
                break;
            case "MergeSort":
                MergeSort.sort(arr);
                break;
            case "MergeSortBU":
                MergeSort.sortBU(arr);
                break;
        }
        long endTime = System.nanoTime();

        if(!SortingHelper.isSorted(arr))
            throw new RuntimeException(sortName + " Failed");
        System.out.printf("%s, n = %d : %f s%n", sortName,arr.length,(endTime-startTime)/1e9);
//        测试性能
    }
}
