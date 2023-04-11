package effective.ch05.item28;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
//        List<String>[] stringList = new List<String>[1];
//        List<Integer> intList = List.of(42);
//        Object[] objects = stringList;
//        objects[0] = intList;
//        String s = stringList[0].get(0);

//        List names = new ArrayList();
//        names.add("John");
//        names.add("Jane");
//        names.add("Alex");
//
//        Object[] arr = names.toArray();

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Alex");

        Object[] arr = names.toArray();  // unchecked cast 경고 발생

        String[] arr2 = names.toArray(new String[0]);

        for (String s : arr2) {
            System.out.println(s);
        }
    }
}
