package baseball.valid;

import java.util.HashSet;
import java.util.Set;

public class InputValid {

    private static final int USER_INPUT_LENGTH = 3;

    private InputValid() {};

    public static boolean isDuplicateValue(String sc) {
        Set<Character> set = characters(sc);
        if (set.size() != sc.length()) {
            System.out.println("중복값이 존재합니다.");
            return true;
        }
        return false;
    }

    public static boolean isThreeLength(String sc) {
        if (sc.length() != USER_INPUT_LENGTH) {
            System.out.println("세자리 정수가 아닙니다.");
            return true;
        }
        return false;
    }

    public static boolean isContainsNumber(String sc) {
        for (int i = 0; i < sc.length(); i++) {
            if (!Character.isDigit(sc.charAt(i)) || sc.contains("0")) {
                System.out.println("숫자가 아닌 값이 존재하거나 숫자 '0'이 포함되어 있습니다.");
                return true;
            }
        }
        return false;
    }

    private static Set<Character> characters(String sc) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            set.add(ch);
        }
        return set;
    }
}
