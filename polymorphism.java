public class polymorphism {
    public static void main(String[] args) {
        fun1(10);
        
    }
    static void fun1(int a){
        System.out.println("This is fun1 with int argument: " + a);
        fun2(5.5);
        

    }
    static void fun2(double b){
        System.out.println("This is fun2 with double argument: " + b);
        fun3("Hello");
    }
    static void fun3(String c){
        System.out.println("This is fun3 with String argument: " + c);
    }
}