package easy;

public class Collatz {

    public void CollatzSequence(int number){

        while(number != 1){
      System.out.println(number);
            if(number %2 ==1){
                //Number is odd
                number = 3*number  +1;
            }else{
                number = number/2;
            }

      System.out.println(number);
        }

    }
}
