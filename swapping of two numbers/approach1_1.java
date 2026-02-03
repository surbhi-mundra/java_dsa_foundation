import java.util.*;
    class demo{
    static void swap(int a, int b) //i had put extra semicolon here
    {
        System.out.println("before swaping value of a= " + a + " and value of b = " + b );
        int t; //varible used was t, and i defined temp
        t=b;
        b=a; //got confused in which vrible is pointing what
        a=t;
        System.out.println("after swaping value of a= " + a + " and value of b = " + b );
    }
}

public class approach1_1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); // got confused on the scanner after new
        System.out.println("enter the value of a");
        int a =scanner.nextInt();
        System.out.println("enter the value of b");
        int b =scanner.nextInt();

    demo.swap(a,b);

}
}
