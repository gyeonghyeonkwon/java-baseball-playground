package baseball;

import java.util.*;
import java.util.stream.Collectors;

public class Computer {
    private final Random random;
    private static final int NINE  = 9 ;
    private static final int ONE  = 1 ;
    private static final int SIZE  = 3 ;

    public Computer() {
        this.random = new Random();
    }

    public int randomNumber() {
        return random.nextInt(NINE) + ONE;
    }

    public List<Integer> uniqueThreeDigit() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < SIZE) {
            set.add(randomNumber());
        }
        return new ArrayList<>(set);
    }
}
