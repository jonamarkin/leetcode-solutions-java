package speak_.stringmanipulation;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if(strs ==null || strs.length ==0){
            return longestCommonPrefix;
        }

        //int index = 0;
        for(int i=0; i < strs[0].toCharArray().length; i++){
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix+=strs[0].charAt(i);

        }

        return longestCommonPrefix;
    }
}
