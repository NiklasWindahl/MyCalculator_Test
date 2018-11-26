import java.util.*;

public class MyCalculator {

  private double num1;
  private double num2;
  private double answer;
  private String operation = "-1";

  Scanner op = new Scanner (System.in);
  Scanner input = new Scanner(System.in);


  private  void printInstructions(){
    try{
      System.out.println("Hello, welcome to MasterGitCalculator");
      System.out.print("Enter first number: ");
      num1 = input.nextDouble();

      System.out.print("Enter second number: ");
      num2 = input.nextDouble();

      Scanner op = new Scanner(System.in);

      System.out.print("Välj: +  -  *  / ");
      operation = op.next();

      if (operation.equals("+"))
         {
             System.out.println("Your Answer is "+(num1 + num2));
         }
         else if (operation.equals("-"))
         {
             System.out.println("Your Answer is "+(num1 - num2));
         }
         else if (operation.equals("*"))
         {
             System.out.println("Your Answer is "+(num1 * num2));
         }
         else if (operation.equals("/"))
         {
             System.out.println("Your Answer is "+(num1 / num2));
         }



 }

catch (Exception e){
  System.out.println("Error has occured, you messed up!");}


  }
  public double getFirstNumber(){
    return num1;

}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    MyCalculator myC = new MyCalculator();
    myC.printInstructions();

  }
}
