//Two sum
import java.util.*;
public class Prog6{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }   
        System.out.println("Target: ");
        int target=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println( + arr[i] + ", " + arr[j]);
                    
                }
            }

        }
    }
}