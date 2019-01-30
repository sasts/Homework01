import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {

    }

    static boolean verifyLogin(String email) {

        return Pattern.matches("[_a-zA-Z-]{1}([_a-zA-Z0-9-]{4,})", email);
    }
}
