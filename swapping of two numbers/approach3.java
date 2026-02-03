import java.util.*;
class demo{
    static void multiply(int a, int b)
    {
        System.out.println("the values of a and b before swapping are "+a+" and "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("the values of a and b after swapping are "+a+" and "+b);
    }
}

public class approach3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=scanner.nextInt();
        System.out.println("enter the value of b: ");
        int b=scanner.nextInt();
     demo.multiply(a,b);
    }
}
