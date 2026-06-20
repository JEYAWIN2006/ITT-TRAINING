import java.util.*;
public class Prog4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text=sc.nextLine();
        int count=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
    }
}