
import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle = " + area);

	}

}
