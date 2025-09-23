package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args){
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(2500);
        salaryList.add(3500);
        salaryList.add(4500);
        salaryList.add(1000);
        salaryList.add(6500);

        Integer[] salaryArray = salaryList.toArray(new Integer[0]);
        System.out.println("salaryArray: " + Arrays.toString(salaryArray));

        long output = salaryList.stream().filter((salary) -> salary > 3000).count();
        System.out.println("Total employee with salary > 3000: " + output);

//        Stream<Integer> stream = salaryList.stream().filter((salary) -> salary > 3000);

//        Stream<Integer> stream = Arrays.stream(salaryArray);

//        Stream<Integer> stream = Stream.of(1,2,3,4,5);

//        Stream<Integer> stream = Stream.iterate(1000,(Integer n) -> n + 2000).limit(5);
        /*
            Intermediate Operations - lazy
            filter, map, flatMap, distinct, sorted, peek, limit, skip, mapToInt, mapToLong, mapToDouble

            Terminal operations
            forEach, toArray, reduce, collect, min, max, count, anyMatch, findFirst, findAny`
        */


    }
}
