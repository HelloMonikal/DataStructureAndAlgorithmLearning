package Learning.Algorithm.Sort;

public class SelectSort {
    private SelectSort(){}

    public static < E extends Comparable<E>>  void sort(E[] arr){
        for(int i =0;i < arr.length; i++){
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }

    }

    public static <E extends Comparable<E>> void sort2(E[] arr){
        for(int i =arr.length -1; i >= 0; i--){
            int maxIndex = i;
            for(int j = i;j >= 0;j--){
                if(arr[j].compareTo(arr[maxIndex]) > 0)
                    maxIndex = j;
            }
            swap(arr,i,maxIndex);
        }
    }



    private static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;

    }

    public static void main(String[] args){
        int [] dataSize = {10000,100000,1000000};
        for(int n : dataSize){
        Integer[] arr = ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("SelectionSort",arr);}





//        Student[] students = {
//                    new Student("George",99),
//                    new Student("Alice",85),
//                    new Student("Harry",86)};
//        SelectSort.sort(students);
//
//        for(Student stu: students) {
//            System.out.print(stu + " ");
//            System.out.println();
//        }
    }

}
