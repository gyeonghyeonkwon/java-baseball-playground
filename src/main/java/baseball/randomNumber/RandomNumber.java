package baseball.randomNumber;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {

    private Set<Integer> set;

    private Set<Integer> number() {
        set = new HashSet<>();
        while (set.size() < 3) { //set 의 크기가 3 이 될 때 까지
            set.add((int) (Math.random() * 9) + 1); // 1 ~ 9 까지 난수 를 set 에 저장.
        }
        return set;
    }

    public Integer[] getArrayNumber() {
        return number().toArray(new Integer[0]); //set 을 배열로 변환
    }
}
