package streamApi;

import java.util.Arrays;
import java.util.List;

public class NumberOfIntegers {
    public static void main(String[] args) {
        //  Given a list of integers, find the total number of elements present in the list using Stream functions?

        List<Integer> list = Arrays.asList(1,2,4,1,3,6,7,3);

        long tot = list.stream().count();
        System.out.println(tot);
    }
}
