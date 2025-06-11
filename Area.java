import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        double r = sc.nextDouble();
        System.out.println("Enter the Width of the Rectangle: ");
        double w = sc.nextDouble();
        double A=r*w;
        System.out.println("The Area of the Rectangle is: "+A);
    }
}
