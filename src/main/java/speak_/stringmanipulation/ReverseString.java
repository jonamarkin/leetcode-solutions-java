package speak_.stringmanipulation;

public class ReverseString {

    public void reverseString(char[] s) {
        int left  = 0;
        int right = s.length-1;

        while(left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;

//            left++;
//            right++;
        }
    }


    public void reverseStringRecursion(char[] s, int left, int right) {
        if(left>= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;

        reverseStringRecursion(s, left, right);
    }
}
