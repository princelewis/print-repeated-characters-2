import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        List<String> wordArray = Arrays.stream(word.split(""))
                .collect(Collectors.toList());

        HashMap<String, Integer> map = new HashMap<>();

        for (String p : wordArray ) {
            int count = Collections.frequency(wordArray, p);
            if (count > 1) {
                map.put(p,count);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " = " + v));


    }
}
