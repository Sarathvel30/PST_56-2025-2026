public class polymorphism2{
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("The sum of a and b is: " + add(a, b));
        System.out.println("The difference of a and b is: " + sub(a, b));
        System.out.println("The product of a and b is: " + mul(a, b));
        System.out.println("The division of a and b is: " + div(a, b));

    
    } 
    static int add(int a, int b)
    {
        return a + b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static float  div(int a, int b)
    {
        return a/b;
    }
    
    
}
    
