import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array");
		int s=sc.nextInt();
		int []nums=new int[s];
		for(int i=0;i<s;i++){
		    nums[i]=sc.nextInt();
		}
		Arrays.sort(nums);
		int m=nums[0];
		int max=1;
		int count=1;
		for(int i=1;i<nums.length;i++){
		    if(nums[i]==nums[i-1]){
		        count++;
		    }
		    else{
		        count=1;
		    }
		    if(count>max){
		        max=count;
		        m=nums[i];
		    }
		}
		System.out.print("The most freq elem"+m);
		
		
	}
}