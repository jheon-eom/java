package oop._06_lsp;

public class App {

    public void increaseHeight(final Rectangle rectangle) {
        if (rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getWidth() + 1);
        }
    }

    public void increaseHeight2(final Rectangle rectangle) {
        if (rectangle instanceof Square) {
            throw new IllegalStateException();
        }

        if (rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getWidth() + 1);
        }
    }

}
