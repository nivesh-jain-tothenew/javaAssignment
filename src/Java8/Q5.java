package Java8;

public class Q5 implements interface1, interface2, interface3{
    @Override
    public void show() {
        //interface2.super.show();
        System.out.println("show is running from implementation class");
    }

    public static void main(String[] args) {
        Q5 d = new Q5();
        d.show();
    }
}
