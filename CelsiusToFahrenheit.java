
import java.util.*;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = input.nextDouble();
	        double fahrenheit = (celsius * 9 / 5) + 32;
	        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

	}

}
