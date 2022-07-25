package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i< nums.length && nums[i] <=0; ++i){
            if(i ==0 || nums[i-1]!=nums[i]){
                twoSumII(nums, i, res);
            }
        }
        return res;
    }

    void twoSumII(int[] nums, int i, List<List<Integer>> res){
        int lo = i+1, hi = nums.length -1;
        while(lo <hi){
            int sum = nums[i] + nums[lo] + nums[hi];

            if(sum <0){
                ++lo;
            }else if(sum >0){
                --hi;
            }else{
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo <hi && nums[lo] ==nums[lo -1])
                    ++lo;
            }
        }
    }

    public boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && stack.peek() =='('){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }

    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                left++;
            }else{
                right++;
            }

            if(left == right){
                maxlength = Math.max(maxlength, 2* right);
            }else if(right>left){
                left = right = 0;
            }

        }

        left = right = 0;
        for(int i =s.length()-1; i>=0; i--){
            if(s.charAt(i) == '('){
                left++;
            }else{
                right++;
            }

            if(left ==right){
                maxlength = Math.max(maxlength, 2 *left);
            }else if(left>right){
                left = right = 0;
            }
        }

        return maxlength;
    }
}
