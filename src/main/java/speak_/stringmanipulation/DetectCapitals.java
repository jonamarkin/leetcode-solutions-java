package speak_.stringmanipulation;

public class DetectCapitals {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                caps++;
            }
        }

        if(caps == word.length() || caps ==0) return true;
        return caps ==1 && Character.isUpperCase(word.charAt(0));
    }

    public boolean detectCapitalUse2(String word) {

        boolean match1 =true, match2 = true, match3 = true;

        //All capitals
        for(int i=0; i<word.length(); i++){
            if(!Character.isUpperCase(word.charAt(i))){
                match1 = false;
                break;
            }
        }
        if(match1){
            return true;
        }

        //All lowercase
        for(int i=0; i<word.length(); i++){
            if(!Character.isLowerCase(word.charAt(i))){
                match2 = false;
                break;
            }
        }
        if(match2){
            return true;
        }

        //First letter is uppercase
        if(!Character.isUpperCase(word.charAt(0))){
            match3 = false;
        }else{
            for(int i=1; i<word.length(); i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    match3 = false;
                    break;
                }
            }
        }
        if(match3){
            return true;
        }

        return false;
    }
}
