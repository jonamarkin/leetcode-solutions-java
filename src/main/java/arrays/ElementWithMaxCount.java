package arrays;

import java.util.*;

public class ElementWithMaxCount {

    public int MaxCountElem(int[] nums){
        int maxCount;
        int maxElement;
//        Arrays.sort(nums);
//        for(int i=0;  i<nums.length; i++){
//            int count = 1;
//            if(nums[i]==nums[i+1]){
//                count++;
//            }else{
//                maxCount =
//                count  = 1;
//            }
//
//        }
//        int i =0;
//        while( i <nums.length-1){
//            if()
//

        HashMap<Integer, Integer> numHash = new HashMap<>();
        for (int num:nums){
            if(numHash.containsKey(num)){
                numHash.put(num, numHash.get(num)+1);
            }else{
                numHash.put(num, 1);
            }
        }

        Collections.max(numHash.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        Collections.max(numHash.values());
        return 0;
    }
}
