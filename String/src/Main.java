import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmpty = strings
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("List with non  empty strings: " + nonEmpty);
    }
}