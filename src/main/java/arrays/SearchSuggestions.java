package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchSuggestions {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here


        List<List<String>> result = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();
        for(int i=1; i<customerQuery.length(); i++){
            String s = customerQuery.substring(0, i+1).toLowerCase();

            List<String> temp = new ArrayList<>();
            for(String repoString: repository){
                if(repoString.toLowerCase().startsWith(s)){
                    temp.add(repoString);
                }

            }

            Collections.sort(temp);

            for(int a =0; a<=2 && a<temp.size(); a++){
                sortedList.add(temp.get(a));
            }

            result.add(sortedList);
        }

        System.out.println(result);
        return result;
    }
}
