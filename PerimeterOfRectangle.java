
import java.util.*;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle = " + perimeter);


	}

}
