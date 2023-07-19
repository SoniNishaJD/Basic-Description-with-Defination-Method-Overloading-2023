public class A {
//Same method name Different parameter is called Method Overloading
    static void foo(int a){
        System.out.println("GOOD MORNING ");
    }

    static void foo(int a, int b){
        System.out.println("Welcome to Nisha's World");
    }

    public static void main(String[] args) {
        foo(32);
        foo(43,45);
    }
}
