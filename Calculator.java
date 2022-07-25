public class Calculator {

  // constructor
  public Calculator(){
  }
// add
  public int add(int a, int b) {
    return a + b;
  }
// subtract
  public int substract(int a, int b) {
    return a-b;
  }
// multiply
  public int multiply(int a, int b) {
    return a * b;
  }

// divide
  public int divide(int a, int b) {
    return a/b;
  }

// modulo
  public int modulo(int a, int b){
    return a%b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.substract(45, 11));
  }

}
