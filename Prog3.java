import java.util.*;
public class Prog3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] quantity=new int[3];
        for(int i=0;i<=2;i++){
            System.out.println("Enter the quantity of product" + (i+1) + ":");
            quantity[i]=sc.nextInt();
        }
        Arrays.sort(quantity);
        int max=quantity[2];
        System.out.println("Maximum quantity is:"+max);
    }
}