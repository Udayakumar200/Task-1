import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        List<String> uppercaseList = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseList);
    }
}
