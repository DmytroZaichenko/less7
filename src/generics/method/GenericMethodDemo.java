package generics.method;

import sun.misc.InnocuousThread;

import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo {

    public static void main(String[] args) {
//        List<String> strings  = Arrays.asList(new String[]{"one", "two", "three"});
//        print(strings);

        List<Integer> numbers = Arrays.asList(new Integer[] {1,2,3});
        print(numbers);

        List<Long> longs = Arrays.asList(new Long[] {1L,2L,3L});
        print(longs);
    }

//    public static <E> void print(List<E> elements){
//        for (E e : elements) {
//            System.out.println(e.toString());
//        }
//    }

    public static void print(List <? extends Number> numbers){
        for (Number n : numbers) {
            System.out.println(n);
        }
    }

}
