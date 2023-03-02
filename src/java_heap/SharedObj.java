package java_heap;

// 싱글톤이라 가정
public class SharedObj {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increase() {
        count++;
    }
}
