package baseball.valid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InputValidTest {
    @Test
    @DisplayName("세자리의 정수값 테스트")
    void t1() {
        String input1 = "123";
        String input2 = "1234";
        boolean bool1 = InputValid.isThreeLength(input1); // 세자리의 정수면 false 반환
        boolean bool2 = InputValid.isThreeLength(input2); // 세자리의 정수가 아니면 true 반환

        assertThat(bool1).isFalse();
        assertThat(bool2).isTrue();
    }

    @Test
    @DisplayName("중복 값 테스트")
    void t2() {
        String input1 = "122";
        String input2 = "111";
        String input3 = "123";

        boolean bool1 = InputValid.isDuplicateValue(input1); // 세자리의 정수면 false 반환
        boolean bool2 = InputValid.isDuplicateValue(input2);
        boolean bool3 = InputValid.isDuplicateValue(input3);

        assertThat(bool1).isTrue();
        assertThat(bool2).isTrue();
        assertThat(bool3).isFalse();
    }

    @Test
    @DisplayName("숫자가 아닌 값 , 0 포함 테스트")
    void t3() {
        String input1 = "abc";
        String input2 = "012";
        String input3 = "123";

        boolean bool1 = InputValid.isContainsNumber(input1); // 세자리의 정수면 false 반환
        boolean bool2 = InputValid.isContainsNumber(input2);
        boolean bool3 = InputValid.isContainsNumber(input3);

        assertThat(bool1).isTrue();
        assertThat(bool2).isTrue();
        assertThat(bool3).isFalse();
    }
}
