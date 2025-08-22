package streamApi;
import java.util.Arrays;
import java.util.List;

public class Duplicate_elements {
    public static void main(String[] args) {
        // How to find duplicate elements in a given integers list in java using Stream functions?

        List<Integer> list = Arrays.asList(1,2,4,1,3,6,7,3);

        //direct print from stream
        // list.stream().distinct().forEach(noDuplicate->System.out.println(noDuplicate));

        //using a list to store
        // List<Integer>ans = list.stream().distinct().collect(Collectors.toList());
        // System.out.println(ans);
    }
}
