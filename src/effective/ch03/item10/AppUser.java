package effective.ch03.item10;

public class AppUser {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("polish");
        String s = "Polish";
        System.out.println(cis.equals(s));

        System.out.println("polish".equals("Polish"));
    }
}
