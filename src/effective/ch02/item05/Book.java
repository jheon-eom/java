package effective.ch02.item05;

public class Book {
    public static void main(String[] args) {
        // 클라이언트에서 사용해야 할 사전을 결정하지 못 함
//        SpellChecker spellChecker = new SpellChecker();
//        boolean checkResult = spellChecker.check("가나다라마");
//        System.out.println(checkResult);

        // 클라이언트에서 사용해야 할 사전을 결정하는 것이 좋음
        SpellChecker goodSpellChecker = new SpellChecker(new KoreanDictionary());
    }
}
