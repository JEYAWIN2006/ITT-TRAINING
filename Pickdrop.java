
import java.util.*;
public class Pickdrop{
    public static void bookRide(String pickup, String destination){
        System.out.println("Booking Confirmed");
        System.out.println("Pickup: "+pickup);
        System.out.println("Destination: "+destination);
    }
    public static void bookRide(String pickup, String destination, String vehicleType){
        System.out.println("Booking Confirmed");
        System.out.println("Pickup: "+pickup);
        System.out.println("Destination: "+destination);
        System.out.println("Vehicle Type: "+vehicleType);
    }
    public static void bookRide(String pickup, String destination, String vehicleType, String couponCode){
        System.out.println("Booking Confirmed");
        System.out.println("Pickup: "+pickup);
        System.out.println("Destination: "+destination);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Coupon Code Applied: "+couponCode);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Select booking option:");
        System.out.println("1. By pickup location and destination.");
        System.out.println("2. By pickup location, destination and vehicle type.");
        System.out.println("3. By pickup location, destination, vehicle type and coupon code.");
        int option = sc.nextInt();
        switch(option) {
            case 1:
                sc.nextLine();
                System.out.println("Booking 1");
                System.out.println("Enter pickup location:");
                String pickup1 = sc.nextLine();
                System.out.println("Enter destination:");
                String destination1 = sc.nextLine();
                bookRide(pickup1, destination1);
                break;
            case 2:
                sc.nextLine(); 
                System.out.println("Booking 2");
                System.out.println("Enter pickup location:");
                String pickup2 = sc.nextLine();
                System.out.println("Enter destination:");
                String destination2 = sc.nextLine();
                System.out.println("Enter vehicle type:");
                String vehicleType2 = sc.nextLine();
                bookRide(pickup2, destination2, vehicleType2);
                break;
            case 3:
                sc.nextLine(); 
                System.out.println("Booking 3");
                System.out.println("Enter pickup location:");
                String pickup3 = sc.nextLine();
                System.out.println("Enter destination:");
                String destination3 = sc.nextLine();
                System.out.println("Enter vehicle type:");
                String vehicleType3 = sc.nextLine();
                System.out.println("Enter coupon code:");
                String couponCode3 = sc.nextLine();
                bookRide(pickup3, destination3, vehicleType3, couponCode3);
                break;
                
            default:
                System.out.println("Invalid option.");
        }
    }
}