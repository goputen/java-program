import java.util.*;
public class averageOfArray{
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int rows;
    System.out.println("enter the size of an array :");
    rows=input.nextInt();

    float number[]=new float[rows];
    System.out.println("enter your array = ");
    for(int i=0;i<number.length;i++){
        number[i]=input.nextFloat();
    }
    float sum=0;
    for(int i=0;i<number.length;i++){
        sum+=number[i];
    }

    float average=sum/number.length;
    System.out.println("the averagae of your array is : "+average);
    input.close();
}
}