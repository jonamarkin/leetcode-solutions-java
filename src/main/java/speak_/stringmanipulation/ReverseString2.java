package speak_.stringmanipulation;

public class ReverseString2 {
    public String reverseString(String s){
        StringBuilder newS = new StringBuilder();
        for(int i= s.length()-1; i>=0; i--){
            newS.append(s.charAt(i));
        }

        return newS.toString();
    }

    public String reverse2(String s){
        StringBuilder newS = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            newS.insert(0, s.charAt(i));
        }

        return newS.toString();
    }
}
