package baseball.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserTest {
    User userValue = new User();

    @Test
    @DisplayName("사용자 입력 테스트")
    void t0(){
        String userInput = "123";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        Scanner scanner = new Scanner(System.in);
        assertThat(userInput).isEqualTo(scanner.nextLine());
    }

    @Test
    @DisplayName("3자리 정수 유효성테스트")
    void t1() {
        List<Integer>list = userValue.getThreeDigitNumbers("122");
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(2);
    }

}
