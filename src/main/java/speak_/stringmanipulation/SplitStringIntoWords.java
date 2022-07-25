package speak_.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class SplitStringIntoWords {
    public String[] splitStringIntoArrayOfWords(String s){
        List<String> listWords = new ArrayList<>();

        StringBuilder word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                listWords.add(word.toString());
                word = new StringBuilder();
            }else{
                word.append(s.charAt(i));
            }
        }
        listWords.add(word.toString());
        return listWords.toArray(new String[listWords.size()]);
    }
}
