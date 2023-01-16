package dynamic_programming;

import java.util.Arrays;

public class TrappingRain {

    public int trap(int[] height) {
        int size = height.length;
        int result = 0;
        //Check if the blocks cana trap water
        if(height.length<=2){
            return 0;
        }

        //Create arrays to store the maximum to the left of every index and
        //max to the right off every index too. So two arrays
        int[] leftmax = new int[size];
        int[] rightmax = new int[size];
//        Arrays.fill(leftmax, 0);
//        Arrays.fill(rightmax, 0);

        //fill up the leftmax array
        leftmax[0] = height[0];
        for(int i=1; i<size; i++){
            //Start loop from 1 because 0 will have nothing to the left
            //The left max of the current index is obtained by comparing the value of
            //the current index in the original array "height" to the leftmax value of the
            //previous position in the leftmax array since that's the current leftmax value'
            leftmax[i] = Math.max(height[i], leftmax[i-1]);

        }

        //Apply a similar principle for the rightmax array but in the oppositee direction
        rightmax[size-1] = height[size-1];
        for(int i=size -2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        //Now we find the max trapped water
        //We loop and apply the formular min(leftmax, rightmax) - currentindex to every index
        for(int i=0; i<size; i++){
            result+= Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return result;

    }
}
