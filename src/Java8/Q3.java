package Java8;

public class Q3 {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("inside a thread");
        new Thread(r).start();
    }
}
