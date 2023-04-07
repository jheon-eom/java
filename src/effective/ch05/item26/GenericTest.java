package effective.ch05.item26;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        /**
         * List<String>은 List의 하위타입이지만
         * List<Object>의 하위타입은 아니다.
         */

        GenericTest gt = new GenericTest();
        gt.processStringList(stringList);
//        gt.processStringList(integerList); // 컴파일 에러

//        gt.processObjectList(stringList); // 컴파일 에러
//        gt.processObjectList(integerList); // 컴파일 에러
        gt.processObjectList(objectList);

        // 로우(Raw) 타입은 모두 허용함. 타입 안정성이 없음
        gt.processRawList(stringList);
        gt.processRawList(integerList);
        gt.processRawList(objectList);

        gt.processWildcardList(stringList);
        gt.processWildcardList(integerList);
    }

    public void processStringList(List<String> list) {

    }

    public void processObjectList(List<Object> list) {

    }

    public void processRawList(List list) {

    }

    public void processWildcardList(List<?> list) {

    }
}
