public class MyCalculator_Test {
  // java skapar en konsturktor, en grundläggande konsturktor;
  private static MyCalculator calc = new MyCalculator();

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


  private static boolean test_StartValueOfFirstNumber(){
    double temp = calc.getFirstNumber();
    if (0 == temp){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    if(test_StartValueOfFirstNumber());{
      System.out.println("test_StartValueOfFirstNumber " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
      }
      System.out.println("test_StartValueOfFirstNumber " + ANSI_RED + "FAILED"+ ANSI_RESET);
    }

}
