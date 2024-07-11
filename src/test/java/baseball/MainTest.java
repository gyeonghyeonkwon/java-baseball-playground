package baseball;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("랜덤 숫자 테스트")
    void test1() {
        int [] number = new int [3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 9 ) + 1;
        }
        System.out.println(Arrays.toString(number));
        assertEquals(3 , number.length);
    }
    @Test
    @DisplayName("숫자 문자열로 바꾸기 ")
    void test2 () {
        String str = "";
        int number = 0;
        for (int i = 0; i < 3; i++) {
             str += String.valueOf((int) (Math.random() * 9 ) + 1);
             number = Integer.parseInt(str);
        }
        System.out.println(number);
    }
}