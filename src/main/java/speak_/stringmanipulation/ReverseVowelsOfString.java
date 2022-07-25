package speak_.stringmanipulation;

public class ReverseVowelsOfString {
  public boolean isVowel(char c) {
    String vowels = "aeouiAEOUI";
    return vowels.indexOf(c) != -1;
  }

  public String reverseVowels(String s) {
    char[] stringArr = s.toCharArray();
    int left = 0;
    int right = stringArr.length - 1;
    for (int i = 0; i < stringArr.length; i++) {
      if (left < right) {
        if (!isVowel(stringArr[left])) {
          left++;
        }
        if (!isVowel(stringArr[right])) {
          right--;
        }

        if (isVowel(stringArr[left]) && isVowel(stringArr[right])) {

          char temp = stringArr[left];
          stringArr[left++] = stringArr[right];
          stringArr[right--] = temp;
        }
      }
    }
    String newS = new String(stringArr);
    return newS;
  }
}
