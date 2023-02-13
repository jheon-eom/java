package effective.ch02.item05;

/**
 * 맞춤법 계산기
 */
public class SpellChecker {
    // 필드에 직접 주입하는 방식은 좋지 않음
    private final KoreanDictionary dictionary = new KoreanDictionary();
    private final Dictionary provideDictionary;

//    public SpellChecker() {
//    }

    public SpellChecker(Dictionary dictionary) {
        provideDictionary = dictionary;
    }

    public boolean check(String value) {
        return dictionary.check(value);
    }
}
