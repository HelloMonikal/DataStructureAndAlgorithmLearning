package homework.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] num, int target){
        int[] index = new int[2];
        for(int i=0; i<num.length; i++){
            for(int j = i+ 1; j<num.length; j++){
                if(num[i] + num[j] == target){
                    index[0] = i;
                    index[1] = j;
                    return index;

                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] mum = {2,7,11,15};
        int target = 9;
        int[] index = new Solution().twoSum(mum,target);
        System.out.println(Arrays.toString(index));

    }

}
