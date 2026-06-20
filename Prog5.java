//Remove duplicates from a string
import java.util.*;
public class Prog5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String[] arr=str.split("");
        String result="";
        for(int i=0;i<arr.length;i++){
            if(!result.contains(arr[i])){
                result+=arr[i];
            }
        }
        System.out.println("String after removing duplicates: "+result);

    }
}