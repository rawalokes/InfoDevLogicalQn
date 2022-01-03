package Infodev;
public class UlgyNumber {
    public static void main(String [] args) {

        int input=10;
        int count=1;
        int i=1;
        while(true) {
            //check if i is ulglyNumber or not
            if(i%2==0 || i%3==0 || i%5==0) {
                //increment ulgly no counter
                count++;
                //print uglyNumber when input == uglynumber count
                if(input==count) {
                    System.out.println(i);
                    break;

                }
            }
            i++;
        }

    }


}
