import java.util.*;
public class Prog7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbner of roll numbers:");
        int n=sc.nextInt();
        int [] roll=new int[n];
        System.out.println("Enter the roll numbers:");
        for(int i=0;i<n;i++){
            roll[i]=sc.nextInt();
        }
        Arrays.sort(roll);
        System.out.println("The missing roll numbers are:");
        for(int j=0;j<n-1;j++){
            int current=roll[j];
            int next=roll[j+1];
            while(current+1<next){
                current++;
                System.out.println(current);
            }
        }
    }
}


