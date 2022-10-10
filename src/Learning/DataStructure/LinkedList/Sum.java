package Learning.DataStructure.LinkedList;

public class Sum {

    public static int sum(int[] arr){
        return sum(0,arr);

    }
    private static int sum(int l,int[] arr ){
        if(l == arr.length)
            return 0;
        return arr[l] + sum(l+1,arr);

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(sum(nums));
    }
}
