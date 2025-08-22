package streamApi;

import java.util.List;
import java.util.*;
import java.util.stream.*;

public class All_Number_Starting_With1 {
    public static void main(String[] args) {
        // Given a list of integers, find out all the numbers starting with 1 using Stream functions?

        //using List

        // List<Integer>list = Arrays.asList(14,45,13,16,34);
        // List<String>ans = list.stream().map(s->s+"").filter(s1->s1.startsWith("1")).collect(Collectors.toList());
        // System.out.println(ans);

//        Using Array

        int [] arr = {11,34,14,16};
        List<String> ans = Arrays.stream(arr).boxed().map(s->s+"").filter(s1->s1.startsWith("1")).collect(Collectors.toList());
        System.out.println(ans);
    }
}
