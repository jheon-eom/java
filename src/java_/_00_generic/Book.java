package java_._00_generic;

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
