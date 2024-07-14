package baseball;

import baseball.randomNumber.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    @DisplayName("난수 테스트1")
    void test1() {
        int [] number = new int [3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 9 ) + 1;
        }
        System.out.println(Arrays.toString(number));
        assertEquals(3 , number.length);
    }

    @Test
    @DisplayName( "난수 테스트2")
    void test2() {
        Set<Integer>set = new HashSet<>();

       while (set.size() < 3) {
           set.add((int) (Math.random() * 9 ) + 1);
       }
        System.out.println(set);

        assertThat(3).isEqualTo(set.size());
    }

    @Test
    @DisplayName(" Interger == int")
    void test3() {
        Integer[] num1 = {1, 2, 3};
        int[] num2 = {1, 2, 3};

        assertEquals(num1[0], num2[0]);
    }

    @Test
    @DisplayName("입력받은 정수를 정수 배열로 변환 테스트")
    void test4() {
        int number = 123;
        String [] arrayStr = String.valueOf(number).split("");

        int [] arrayNum = new int[arrayStr.length];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(arrayStr[i]);
        }
        assertEquals(3 , arrayNum.length);
        assertThat(1).isEqualTo(arrayNum[0]);
        assertThat(2).isEqualTo(arrayNum[1]);
        assertThat(3).isEqualTo(arrayNum[2]);
    }
}
