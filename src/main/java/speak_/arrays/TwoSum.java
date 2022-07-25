package speak_.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for(int i=0; i<nums.length; i++){
            int cur = nums[i];
            int x= target - cur;

            if(hashMap.containsKey(x)){
                return new int[] {i, hashMap.get(x)};
            }else{
                hashMap.put(cur,i);
            }
        }

        return null;
    }
}
