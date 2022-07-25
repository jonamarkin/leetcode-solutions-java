package speak_.stringmanipulation;

public class ReverseWordInString {
    public String reverseWords(String s) {
        String[] sArray = s.split(" ");
        StringBuilder newString = new StringBuilder();
        for (String word : sArray) {
            newString.append(new StringBuffer(word).reverse() + " ");
        }

        return newString.toString().trim();
    }
}
