package speak_.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static boolean ThreeSum(int[] arr) {
    // code goes here
    int target  = arr[0];


    List<Integer[]> res = new ArrayList<>();

    int[] arrNew  = Arrays.stream(arr).filter(x -> x != target).toArray();
    Arrays.sort(arrNew);

    for(int i=0; i<arrNew.length; i++){
      int left = i+1;
      int right = arrNew.length-1;



      while(left <right){

        int summation = arrNew[i] +arrNew[left] +arrNew[right];

        if(summation ==target){
          res.add(new Integer[]{ arrNew[i], arrNew[left], arrNew[right]});
          left++;
          right--;
        }else if(summation < target){
          ++left;
        }else{
          --right;
        }
      }
    }
    if(res.isEmpty()){
      return false;
    }else{
      return true;
    }


  }

}
