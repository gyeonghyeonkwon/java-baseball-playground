package baseball;

import java.util.*;
import java.util.stream.Collectors;

public class Computer {
    private final Random random;
    private static final int nine  = 9 ;
    private static final int one  = 1 ;

    public Computer() {
        this.random = new Random();
    }

    public int randomNumber() {
        return random.nextInt(nine) + one;
    }

    public List<Integer> uniqueThreeDigit() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 3) {
            set.add(randomNumber());
        }
        return new ArrayList<>(set);
    }
}
