package java_generic.old;

public class Book implements Materials {

    private String name = "책";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
