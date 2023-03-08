package java_generic.category;

public class CategoryHelper {

    public void popNoodle(Category<? extends Noodle> category) {
        Noodle noodle = category.get();
//        category.set(new Noodle());
    }

    public void pushNoodle(Category<? super Noodle> category) {
        category.set(new Noodle());
//        Noodle noodle = category.get();
    }
}
