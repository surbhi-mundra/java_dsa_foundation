import java.util.*;
                class demo {
    static void add(int a, int b)
    {
        System.out.println("the values of a and b are " + a +" and "+ b + " before swapping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the values of a and b are " + a +" and "+ b + " after swapping");
    }
}
public class approach2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=scanner.nextInt();
        System.out.println("enter the value of b: ");
        int b=scanner.nextInt();
    demo.add(a,b);
    }
}
