package homework.works;

public class MergeSort {
    private MergeSort() {
    }


    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        sort(array);

        for (int i : array)
            System.out.print(i + " ");
    }

    private static void sort(int[] arr) {
          
        int length = arr.length;
        if (length <= 1) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[mid];



    }

    private static void merge(int[] arr, int l, int mid, int r) {

    }


}
