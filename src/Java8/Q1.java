package Java8;

import java.util.Locale;

public class Q1{

    public static void main(String[] args) {
        Interface1 m1 = (a, b) ->
        {
            if(a > b)
                return a;
            else if(b > a)
                return b;
            return 0;
        };
        System.out.println(m1.greater(2,3));

        Interface2 m2 = (a1) ->
        {
            int r = a1 + 1;
            return r;
        };
        System.out.println(m2.increment(2));

        Interface3 m3 = (x, y) ->
        {
            return x.concat(y);
        };
        System.out.println(m3.concat("hello", "java8"));

        Interface4 m4 = (p) ->
        {
            return p.toUpperCase(Locale.ROOT);
        };

        System.out.println(m4.uppercase("hello"));

    }

}
