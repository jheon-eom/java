package effective.ch02.item07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * 해당 pop() 메서드는 객체를 꺼낸 이후에도
     * 참조를 가지고 있음 (= 여전히 메모리를 차지)
     */
//    public Object pop() {
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
//        size--;
//        Object element = elements[size];
//        System.out.println("======같은 객체인가?======");
//        System.out.println(element.hashCode());
//        System.out.println(elements[size].hashCode());
//        return element;
//    }

    /**
     * null 처리를 통해 가비지 컬렉터에게
     * 가비지 컬렉션의 대상임을 알리자
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        size--;
        Object element = elements[size];
        elements[size] = null;
        System.out.println("======같은 객체인가?======");
        System.out.println(element.hashCode());
        System.out.println(elements[size].hashCode()); // NPE가 뜰 것을 기대
        return element;
    }

    public int size() {
        return this.size;
    }

    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
