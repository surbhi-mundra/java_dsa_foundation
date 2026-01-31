import java.util.Scanner;
class approach1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int a;
    System.out.println("enter the value of a variable:");
    a=scanner.nextInt();
    int b;
    System.out.println("enter the value of b variable:");
    b=scanner.nextInt();
    int c;
    c=a+b;
    System.out.println("the addition of " + a + " and " + b + " is " + c);
    scanner.close();
  }
    
    
}