import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

  public static void main(String[] args) {
    int[] ints = {17,5,13,8,16,1,2};


    //System.out.println("Sequence: " +CollatzSequence(1000000));
    //System.out.println(longestSequence());

    String word = "cat";
    System.out.println(new StringBuffer(word).reverse());

    System.out.println( reverseString(word));

  }

  public static String reverseString(String s){
    StringBuilder newS = new StringBuilder();
    for(int i= s.length()-1; i>=0; i--){
      newS.append(s.charAt(i));
    }

    return newS.toString();
  }


  public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    //HashSet<Integer> sockColors = new HashSet<>();
    HashMap<Integer, Integer> numHash = new HashMap<>();
    int numPairs = 0;
    for (int num:ar){
      if(numHash.containsKey(num)){
        if((numHash.get(num)+1)%2 ==0){
          numPairs++;
        }
        numHash.put(num, numHash.get(num)+1);
      }else{
        numHash.put(num, 1);
      }
    }

    System.out.println(numHash);

//    for (Integer integer : numHash.values()) {
//      if(integer>2){
//        numPairs+=1;
//      }
//
//    }

    return numPairs;

  }

  public static List greaterRight(int[] arr){
    List<Integer> result = new ArrayList<>();

    int max = 0;
    for (int i = arr.length-1; i>=0; i--){
      if(Math.max(max, arr[i])>max){
        max = Math.max(max, arr[i]);
        result.add(arr[i]);
      }
    }

    return result;
  }

  public static int[] twoSum(int[] arr, int target){
    //For every element look for the other element that makes it add up to the target
    //int elem +x = target;
    //x = target-elem;

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int cur = arr[i];
      int x = target - cur;

      if(map.containsKey(x)){
        return new int[]{map.get(x), i};
      }else{
        map.put(cur, i);
      }
    }


    return null;
  }

  public static int[] twoSum2(int[] arr, int target){
    //Using two pointers
    //First sort the array
    Arrays.sort(arr);
    int low = 0;
    int high = arr.length-1;
    while(low<high){
      int sum = low +high;

      if(sum == target){
        return new int[]{low, high};

      }else if(sum <target){
        ++low;
      }else{
        ++high;
      }
    }

    return new int[]{-1,-1};
  }

  public static int CollatzSequence(int number){

    if(number ==0){
      return 0;
    }

    int sequence = 1;
    while(number != 1){
      //System.out.println(number);
      if(number %2 ==1){
        //Number is odd
        number = 3*number  +1;
      }else{
        number = number/2;
      }

      //System.out.println(number);
      sequence ++;
    }

    return sequence;
  }


  public static int longestSequence(){


      HashMap<Integer, Integer> colls = new HashMap<>();

      for (int i=1; i<=1000000; i++){

      System.out.print(i);
        int seq = CollatzSequence(i);
        colls.put(i, seq);
        //longestSequence = Math.max(longestSequence, seq);
      }

    int key = Collections.max(colls.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

    System.out.println(colls);
      return key;
  }

}
