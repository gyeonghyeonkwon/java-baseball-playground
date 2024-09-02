package baseball;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class InputValid {

    private static final int USER_INPUT_LENGTH = 3;

    public static boolean  isDuplicateValue(String sc) {
        Set<Character> set = characters(sc);
        return set.size() != sc.length();
    }

    public static boolean isThreeLength(String sc) {
        return sc.length() != USER_INPUT_LENGTH;
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
