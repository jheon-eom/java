package oop._06_lsp;

/**
 * 정사각형
 * 정사각형은 직사각형이지만, 직사각형은 정사각형이 아님
 *
 * 정사각형이 직사각형이 되든,
 * 직사각형이 정사각형이 되든,
 * 기능에 문제가 생기면 안 된다.
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
