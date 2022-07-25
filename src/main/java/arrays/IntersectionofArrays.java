package arrays;

import java.util.HashSet;

public class IntersectionofArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1hashset = new HashSet<>();
        HashSet<Integer> nums2hashset = new HashSet<>();


        //Insert the values into hashsets
        for(int num: nums1) nums1hashset.add(num);
        for(int num: nums2) nums2hashset.add(num);


        if(nums1hashset.size() >nums2hashset.size()){
            int[] arrayIntersections = new int[nums2hashset.size()];
            int index = 0;
            for(Integer num: nums2hashset){
                if(nums1hashset.contains(num)){
                    arrayIntersections[index++] = num;
                }
            }
        }else{

        }

        return null;
    }

}
