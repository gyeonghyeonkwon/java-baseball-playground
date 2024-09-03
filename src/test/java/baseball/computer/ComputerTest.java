package baseball.computer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.*;

public class ComputerTest{

    Computer computer = new Computer();

    @Test
    @DisplayName("컴퓨터 1 ~ 9 까지의 랜덤 숫자 생성 테스트")
    void t1() {
        int randomNumber = computer.randomNumber();
        System.out.println(randomNumber);
    }

    @Test
    @DisplayName("세자리의 정수 생성 (중복 값 제거) ")
    void t2() {
            List<Integer> computerNumber = computer.uniqueThreeDigit();
            assertThat(computerNumber.size()).isEqualTo(3);
            System.out.println(computerNumber);
    }
}
