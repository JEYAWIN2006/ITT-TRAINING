import java.util.*;
public class Parking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int slots=100;
        System.out.println("Cars Entering: ");
        int cars=sc.nextInt();
        for(int i=1;i<=cars;i++){
                System.out.println("Car "+i+" entered");
                System.out.println("Available slots: "+(slots-i));
        }
    }
}