import java.util.Scanner;
class add_two_numbers{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int a;
    System.out.println("enter the first variable");
    a=scanner.nextInt();
    int b;
    System.out.println("enter the second variable");
    b=scanner.nextInt();
    int c;
    c=a+b;
    System.out.println("the addition of " + a + " and " + b + " is " + c);
    scanner.close();
  }
    
    
}