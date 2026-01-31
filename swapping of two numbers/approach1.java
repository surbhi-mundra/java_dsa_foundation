public class approach1 {
    public static void main(String[] args){
        int a=5;
        int b=10;
        System.out.println("value of a is " + a + " before swapping");
        System.out.println("value of b is " + b + " before swapping");
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a is " + a + " after swapping");
        System.out.println("value of b is " + b + " after swapping");
    }
}
