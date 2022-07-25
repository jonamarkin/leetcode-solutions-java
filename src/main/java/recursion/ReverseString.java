package recursion;

public class ReverseString {
    public void reverseStringRecursion(char[] s, int left, int right) {
        if(left>= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;

        reverseStringRecursion(s, left, right);
    }
}
