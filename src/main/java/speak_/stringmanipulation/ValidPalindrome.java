package speak_.stringmanipulation;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^A-Za-z0-9]", "");
        newS = newS.toLowerCase();
        int left = 0;
        int right = newS.length()-1;

        for(int i =0; i< newS.length(); i++){
            if(newS.charAt(left)!= newS.charAt(right)){
                return false;
            }else{
                left++;
                right --;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s){
        StringBuilder string = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                string.append(Character.toLowerCase(c));
            }
        }

        String formattedString = string.toString();
        String reversedString = string.reverse().toString();

        return formattedString.equals(reversedString);
    }
}
