package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("난수 테스트")
    void test1() {
        int [] number = new int [3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 9 ) + 1;
        }
        System.out.println(Arrays.toString(number));
        assertEquals(3 , number.length);
    }

    @Test
    @DisplayName("난수 테스트")
    void test3 () {
    int number [] = {4,4,5,5,6,6};
    Set<Integer> set = new HashSet<>();
        for (int i : number) {
            set.add(i);
        }
       number = new int[set.size()];
        int index = 0;
        for (int i : set) {
            number[index] = i;
            index ++;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    @Test
    @DisplayName( "숫자 중복테스트2")
    void test4() {
        Set<Integer>set = new HashSet<>();

       while (set.size() < 3) {
           set.add((int) (Math.random() * 9 ) + 1);
       }
        System.out.println(set);

        assertThat(3).isEqualTo(set.size());
    }
}