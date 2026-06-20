import java.util.*;
public class Prog2{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the serial number of the product");
        int serialnumber=sc.nextInt();
        int reverse=0;
        int temp=serialnumber;
        while(serialnumber>0){
            int remainder=serialnumber%10;
            reverse=reverse*10+remainder;
            serialnumber=serialnumber/10;
        }
        if(reverse==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palinndrome");
        }
    }
}