package java_generic;

public class Pencil implements Materials {

    private String name = "연필";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
