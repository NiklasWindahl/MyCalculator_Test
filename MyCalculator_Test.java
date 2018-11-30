public class MyCalculator_Test {
  // java skapar en konsturktor, en grundläggande konsturktor;
  private static MyCalculator calc = new MyCalculator();

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[0;34m";
    public static final String ANSI_RESET = "\u001B[0m";


  private static boolean test_StartValueOfFirstNumber(){
    double temp = calc.getFirstNumber();
    if (0 == temp){
      return true;
    }
    return false;
  }

  private static boolean test_StartValueOfSecondNumber(){
    double temp = calc.getSecondNumber();
    if (0 == temp){
      return true;
    }
    return false;
  }

  private static boolean test_StartValueOfOperation(){
    String temp = calc.getOperation();
    if ("-1" == temp){
      return true;
    }
    return false;
  }

  private static boolean test_StartValueOfAnswer(){
    double temp = calc.getAnswer();
    if (0 == temp){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    if(test_StartValueOfFirstNumber()){
      System.out.println(ANSI_BLUE + "test_StartValueOfFirstNumber:  " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    }else{
      System.out.println("test_StartValueOfFirstNumber:  " + ANSI_RED + "FAILED"+ ANSI_RESET);
    }

    if(test_StartValueOfSecondNumber()){
      System.out.println(ANSI_BLUE + "test_StartValueOfSecondNumber: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    }else{
      System.out.println("test_StartValueOfSecondNumber: " + ANSI_RED + "FAILED"+ ANSI_RESET);
    }

    if(test_StartValueOfOperation()){
      System.out.println(ANSI_BLUE + "test_StartValueOfOperation:    " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    }else{
      System.out.println("test_StartValueOfOperation:    " + ANSI_RED + "FAILED"+ ANSI_RESET);
    }
    if(test_StartValueOfAnswer()){
      System.out.println(ANSI_BLUE + "test_StartValueOfAnswer:       " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    }else{
      System.out.println("test_StartValueOfAnswer:       " + ANSI_RED + "FAILED"+ ANSI_RESET);
    }
  }
}
