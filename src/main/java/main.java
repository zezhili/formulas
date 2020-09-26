import java.util.Scanner;


public final class main {

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter present value: ");
    double p=sc.nextDouble();
    System.out.print("Enter the interest rate: ");
    double r=sc.nextDouble();
    System.out.print("Enter the time period in years: ");
    double y=sc.nextDouble();
    System.out.print("Enter future value: ");
    double f=sc.nextDouble();

    double answer = 1;
    if (p == -1) {
      answer = f / Math.pow((1 + r / 100), y);
    }
    if (r == -1) {
      answer = (Math.pow((f/p), (1/y)) - 1)*100;
    }
    if (y == -1) {
      answer =  Math.log(f/p) / Math.log(1+ (r/100));
    }
    if (f == -1) {
      answer = p * Math.pow((1 + r / 100), y);
    }

    System.out.print("value is: "+ answer);
  }
}
