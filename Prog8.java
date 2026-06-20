//Longest substring wothout repating characters

import java.util.*;
public class Prog8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String longest="";
        int count=0;
        for(int i=0;i<str.length();i++){
            String current="";
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);
                if(current.contains(String.valueOf(ch))){
                    break;
                }
                current+=ch;
                if(current.length()>longest.length()){
                    longest=current;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}