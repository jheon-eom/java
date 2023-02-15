package effective.ch02.item07;

import java.util.Stack;

public class UseStackClass {
    public static void main(String[] args) {
        /**
         * 직접 구현한 스택을 생성 시
         * 스택 내부의 Ojbect 배열인 elements에 크기 16을 할당
         */
        Stack stack = new Stack();
        extracted(stack);

        // stack의 size는 16
        System.out.println("stack의 size는 = " + stack.size());
        // pop
        stack.pop();
        System.out.println("pop 이후 stack의 size는 = " + stack.size());

    }

    private static void extracted(Stack stack) {
        for (int i = 0; i < 16; i++) {
            SampleBox exampleBox = new SampleBox();
            stack.push(exampleBox);
        }
    }
}

class SampleBox {

}