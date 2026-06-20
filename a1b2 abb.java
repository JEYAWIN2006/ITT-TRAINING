import java.util.*;
public class Aaa
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();){
		    char ch=s.charAt(i++);
		    String num= "";
		    while(i<s.length() && Character.isDigit(s.charAt(i))){
		        num+=s.charAt(i++);
		    }
		    int n=Integer.parseInt(num);
		    for(int j=0;j<n;j++){
		        result.append(ch);
		    }
		}
		System.out.print(result);
		
	}
}