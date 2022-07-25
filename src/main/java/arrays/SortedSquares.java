package arrays;

import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        for(int i=0; i<n; i++){
            results[i] = nums[i] * nums[i];
        }

        Arrays.sort(results);

        return results;


    }
}
