import java.util.*;

public class getiTHbit {
    public static void getBit(int number,int pos){
     int bitmask=1<<pos;
       if((number&bitmask)==0){
        System.out.println("bit value is 0");
       }
       else{
        System.out.println("bit value is 1");
       }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter any number ");
        number = input.nextInt();
        System.out.println("enter position");
        int pos=input.nextInt();
        getBit(number,pos);
        input.close();
    }

}
