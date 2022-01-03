package Infodev;

public class Pattern {

    public static void main(String [] args) {

        for(int i=1;i<=4;i++) {
            //to increment the i
            int count=0;
            for(int j=1;j<=4;j++) {
                System.out.print(i+count +" ");
                //add 4 to counter
                count+=4;
            }
            //change line
            System.out.println();
        }


    }
}

