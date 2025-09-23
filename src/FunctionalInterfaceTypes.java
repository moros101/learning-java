import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTypes {

    public static void main(String[] args) {
        // Consumer
        Consumer<Integer> consumerObj = (Integer val)  -> {
            if (val > 10) {
                System.out.println("Logging");
            }
        };
        consumerObj.accept(20);

        // Supplier
        Supplier<String> supplierObj = () -> "This is the data I'm returning";
        System.out.println(supplierObj.get());

        // Function
        Function<Integer,String> functionObj = ( num) -> {
            String output = num.toString();
            return output;
        };
        System.out.println(functionObj.apply(64));

        // Predicate
        Predicate<Integer> isEven = (Integer num) -> {
            if (num % 2 == 0) {
                return true;
            }else{
                return false;
            }
        };
        System.out.println(isEven.test(64));


        /* Reflection [ class Class ]

           3 ways to get object of Class which JVM creates
            1.  Class birdClass = Class.forName("Bird");
            2.  Class birdClass = Bird.class;
            3.  Bird birdObj = new Bird();
                Class birdClass = birdObj.getClass();
        */





    }
}
