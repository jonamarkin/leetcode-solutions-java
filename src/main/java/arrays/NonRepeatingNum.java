package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class NonRepeatingNum {
    public int numberThatOccursOnce(int[] nums){

        HashSet<Integer> ints = new HashSet<Integer>();
        for(int num:nums){
            if(ints.contains(num)){
                ints.remove(num);
            }else{
                ints.add(num);
            }
        }
        for(int num: ints){
            return num;
        }

        return -1;
    }
}
