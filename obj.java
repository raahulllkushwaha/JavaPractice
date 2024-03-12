class A {
    public String str;

    public void myMethod() {
        System.out.println("Hello from class A..!!!");
    }
}

public class obj {
    public static void main(String[] args) {
        A a = new A();
        a.str = "rahul";
        System.out.println("My String is: " + a.str);
        a.myMethod();
    }
}
