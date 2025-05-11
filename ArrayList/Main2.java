import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        //Partially Modifiable
        // list1.add(50) Throw Exception
        list1.set(3,50);
        System.out.println(list1);

        List<Integer> list2 = List.of(10,20,30,40);
        //Unmodifiable

        //Another way of Adding Elements
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(10);
        list3.add(10);
        list3.add(10);

        list3.addAll(list2);
        System.out.println(list3);


    }
}
