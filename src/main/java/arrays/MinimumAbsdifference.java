package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsdifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr){
    Arrays.sort(arr);
    int minDiff = Integer.MAX_VALUE;

    List<List<Integer>> res = new ArrayList<>();
    for(int i=0; i<arr.length; i++){

        int curDiff = arr[i +1] - arr[i];

        if(minDiff == curDiff){
            res.add(Arrays.asList(arr[i], arr[i+1]));
        }else{
            res.clear();
            res.add(Arrays.asList(arr[i], arr[i+1]));
            minDiff = curDiff;
        }
    }

    return res;
    }
}
