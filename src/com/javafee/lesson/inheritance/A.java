package src.com.javafee.lesson.inheritance;

public class A extends B{
    public A() {
        System.out.println("A created");
    }

    public A(String message) {
        super(message);
        System.out.println("A created: " + message);
    }

    public void a(){
    }
}
