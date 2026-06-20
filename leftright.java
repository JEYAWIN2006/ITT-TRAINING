import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<n;k++){
             int sum=0;
             int sum2=0;
            for(int i=k;i<n;i++){
                sum+=arr[i];
            }
            for(int i=k;i>=0;i--){
                sum2+=arr[i];
            }
            if(sum==sum2){
                System.out.print(arr[k] + " ");
                break;
            }
        }
        
        
    }
}