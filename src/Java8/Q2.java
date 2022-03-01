package Java8;

public class Q2 {

    static void Multiplication(int a, int b)
    {
        System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
    }
    void addition(int a, int b)
    {
        System.out.println("sum of "+a+" and "+b+" is "+(a+b));
    }
    void substraction(int a, int b)
    {
        System.out.println("substraction of "+a+" and "+b+" is "+(a-b));
    }

    public static void main(String[] args) {

        i3 staticCall = Q2::Multiplication;
        staticCall.multiply(2, 3);

        i1 instanceCall1 = new Q2()::addition;
        instanceCall1.add(7,19);

        i2 instanceCall2 = new Q2()::substraction;
        instanceCall2.subcract(23, 46);
    }
}
