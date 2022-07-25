package arrays;

import java.util.HashSet;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails){
        HashSet<String> uniqueMails = new HashSet<>();
        String localName = "";
        for(String email:emails){
           localName = email.substring(0, email.indexOf("@"));
           if(localName.contains(".")){
              localName =  localName.replace(".","");
           }
           if(localName.contains("+")){
               localName = localName.substring(0, localName.indexOf("+"));
           }
           String formattedEmail = localName + email.substring(email.indexOf("@"));
           uniqueMails.add(formattedEmail);
        }

        return uniqueMails.size();
    }



    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int insertIndex = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!= nums[i-1]){
                nums[insertIndex] = nums[i];
                insertIndex ++;
            }
        }

        return insertIndex;
    }



}
