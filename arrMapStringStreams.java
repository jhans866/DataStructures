import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class arrMapStringStreams {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // {1, 2, 3, 4, 5, 6}
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<String> str = new ArrayList<>() ;
        str.add("asa");
        str.add("dfd");
        str.add("ads");
        HashMap<Integer, String> hm = new HashMap<>();
        hm = (HashMap<Integer, String>) IntStream.range(0,arr.size())
                .boxed()
                .collect(Collectors.toMap(
                        i->arr.get(i),
                        i->str.get(i)
                ));

        String inputString = "Hello, World!";
// Count the frequency of each character in the string
        HashMap<Character, Long> frequencyMap = (HashMap<Character, Long>) inputString.chars()  // Convert the string to an IntStream of characters
                .mapToObj(c -> (char) c)  // Convert each int to a Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Group by the character and count
// Print the frequency map
        frequencyMap.forEach((character, count) -> System.out.println(character + ": " + count));
    }


}

