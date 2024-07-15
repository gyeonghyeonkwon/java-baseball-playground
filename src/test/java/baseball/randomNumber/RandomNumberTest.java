package baseball.randomNumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;
import java.util.Set;


class RandomNumberTest {

  private RandomNumber randomNumber = new RandomNumber();

  @Test
  @DisplayName("난수 배열 테스트")
  void test1() {
    Integer[] array = randomNumber.getArrayNumber();
    assertThat(3).isEqualTo(array.length);

    for (Integer i : array) {
      assertThat(i).isBetween(1, 9);
    }
  }
}