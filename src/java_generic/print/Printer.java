package java_generic.print;

import java.util.Arrays;
import java.util.List;

public class Printer {

    public void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> strList = Arrays.asList("a", "b", "c");
        printer.printList(strList);
    }
}
