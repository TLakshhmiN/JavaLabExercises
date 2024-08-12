public class OOPS10 {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
        OOPS10 obj = new OOPS10();
        obj.myPublicMethod();
    }
}
