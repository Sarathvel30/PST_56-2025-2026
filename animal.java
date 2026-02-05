public class animal{
    public static void main(String[] args) {
        dog a=new dog();
        cat b=new cat();
        a.sound();
        b.sound();
        
    }
}class dog extends animal {
    static void sound() {
        System.out.println("Dog barks");
    }
}class cat extends dog {
    static void sound() {
        System.out.println("Cat meows");
    }
}