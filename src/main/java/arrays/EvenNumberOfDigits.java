package arrays;

import java.util.Arrays;

public class EvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                count++;
            }
            if(count%2==0){
                evenDigits++;
            }
        }
        return evenDigits;
    }


    public int findEvenDigitNumbers(int[] nums) {
        int count =0;
        Arrays.sort(nums); //Collections.sort() for List,Vector
        String a=Arrays.toString(nums); //toString the List or Vector
        String ar[]=a.substring(1,a.length()-1).split(", ");
        for(int i=0;i<ar.length;i++){
            if(ar[i].length()%2==0){
                count++;
            }
        }
        return count;
    }


    public int findDigitEvenNumbers(int[] nums) {
        int c = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count(nums[i]) % 2 == 0) {
                c++;
            }
        }

        return c;
    }

    public int count(int num) {
        if(num == 0) {
            return 1;
        }

        int i = 0;
        while(num != 0) {
            num /= 10;
            i++;
        }

        return i;
    }

  public int findNumbers2(int[] nums) {
    int count = 0;
    for (int num : nums) {
      int digCount = 0;
      while (num > 0) {
        digCount++;
        num = num / 10;
      }
      if (digCount % 2 == 0) {
        count++;
      }
    }

    return count;
        }


}
