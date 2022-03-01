package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        /*System.out.println(Arrays.stream(arr)
                .filter(value -> value%2==0).toArray());*/

        Arrays.stream(arr).filter(value -> value%2==0).forEach(System.out::println);
    }
}
