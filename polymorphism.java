public class polymorphism {
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        obj.fun1(10);
        obj.fun2(5.5);
        obj.fun3("Hello");  
        
    }
    void fun1(int a){
        System.out.println("This is fun1 with int argument: " + a);
        

    }
    void fun2(double b){
        System.out.println("This is fun1 with double argument: " + b);
    }
    void fun3(String c){
        System.out.println("This is fun1 with String argument: " + c);
    }
}