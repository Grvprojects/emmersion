 import java.util.Scanner;
public class Add {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter the second number: ");
      double var4 = var1.nextDouble();
      double var6 = var2 + var4;
      System.out.println("The sum of " + var2 + " and " + var4 + " is " + var6);
      var1.close();
   
}

}
