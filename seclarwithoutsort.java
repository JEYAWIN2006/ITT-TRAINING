

public class seclarwithoutsort
{
	public static void main(String[] args) {
		int []nums={4,5,6,8,3,2,6,7,6};
		int large=-1;
		int s=-1;
		for(int i:nums){
		    if(i>large){
		        s=large;
		        large=i;
		    }
		    else if(i<large){
		        s=i;
		    }
		}
		System.out.print(s);
	}
}