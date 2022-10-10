package homework.works;

public class LinearSearch {
    private LinearSearch(){}

    public static <E> int Search(E[] arr, E target){

        for(int i =0; i<arr.length; i++){
            if(arr[i].equals(target))
                return i;
        }
        return -1;
    }


    public static void main(String[] args){

        Integer [] arr = {1,2,5,8,9,3,4,4};
        Integer target = 3;
        System.out.println(LinearSearch.Search(arr,target));
//        System.out.println(System.getProperty("java.version"));
    }

}
