import java.util.*;

public class MyCalculator {

  private double num1;
  private double num2;
  private double answer;
  private String operation = "-1";

  Scanner op = new Scanner (System.in);
  Scanner input = new Scanner(System.in);

//konstruktor som ger nya instanser av MyCalculator startvärde från reset
public MyCalculator(){
  reset();
}

public double getFirstNumber(){
  return num1;
}
public double getSecondNumber(){
  return num2;
}
public String getOperation(){
  return operation;
}
public double getAnswer(){
  return answer;
}
public void callAdd(double num1, double num2){
  add(num1, num2);
  return answer;
}

public static void reset();{
  num1        = 0;
  num2        = 0;
  answer      = 0;
  operation = "-1";
}


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

// Skapa en funktion för varje operation som vi sen kan testa
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

 }     catch (Exception e){
  System.out.println("Error has occured, you messed up!");}

}

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    MyCalculator myC = new MyCalculator();
    myC.printInstructions();

  }

}
