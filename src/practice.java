import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String [] args){

        //1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        //2. Skip first five elements
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
        System.out.println();

        //3. Integer Stream wih sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

        //4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Luther", "Tachala")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5. Stream from an array -> sort, filter, and print
        String [] names = {"su", "buckets", "cheese", "sullah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("s"))
                .sorted()
                .forEach(System.out::println);

        //6. average of squares in an int array
        Arrays.stream(new int [] {2, 4, 6, 8, 9, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        //7. Stream from List -> filter and print
        List<String> niggas = Arrays.asList("Ava", "Luther", "Tachala", "su", "buckets", "cheese", "sullah");
        niggas
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("t"))
                .forEach(System.out::println);
    }
}
