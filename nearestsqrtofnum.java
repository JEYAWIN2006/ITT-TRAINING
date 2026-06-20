/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=s.nextInt();
		double root=Math.round(Math.sqrt(num));
		double poww=Math.pow(root,2);
		double k=Math.sqrt(poww);
		System.out.print(poww);
	}
}