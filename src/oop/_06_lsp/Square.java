package oop._06_lsp;

/**
 * 정사각형
 * 정사각형은 직사각형이지만, 직사각형은 정사각형이 아님
 */
public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);

    }

}
