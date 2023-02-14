package java_generic;

public class GenericEx {

    public static Bag<? extends Materials> school(String day) {
        Bag bag = new Bag();

        if ("월요일".equals(day)) {
            Book book = new Book();
            bag.setData(book);
        } else {
            Pencil pencil = new Pencil();
            bag.setData(pencil);
        }

        return bag;
    }

    public static void main(String[] args) {
        Bag<? extends Materials> bag = school("화요일");
        System.out.println(bag.getData().getName());
    }

}
