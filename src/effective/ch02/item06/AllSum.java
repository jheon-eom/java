package effective.ch02.item06;

public class AllSum {
    public static void main(String[] args) {
        /**
         * 오토박싱을 잘못 사용한다면 심각한 성능 저하 문제를 초래한다
         */
//        System.out.println(sum());
//        System.out.println(sum2());

    }
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    private static long sum2() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
