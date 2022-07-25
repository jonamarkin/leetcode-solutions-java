package arrays;

import java.util.HashSet;

public class CheckIfNAndDoubleExist {
    public boolean checkIfExist(int[] arr){
        HashSet<Integer> checked = new HashSet<>();
        for(int num: arr){
            if(checked.contains(num * 2) || (num % 2 == 0 && checked.contains(num / 2))){
                return true;
            }
            checked.add(num);
        }
        return false;
    }
}
