import java.util.*;
public class Prog1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente rthe transactionid:");
        int transactionid=sc.nextInt();
        int reverse=0;
        while(transactionid>0){
            int remainder=transactionid%10;
            reverse=reverse*10+remainder;
            transactionid=transactionid/10;
        }
        System.out.println("Reversed transaction ID: " + reverse);
    }
}