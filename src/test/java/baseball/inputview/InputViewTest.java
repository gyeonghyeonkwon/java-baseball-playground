package baseball.inputview;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewTest {
    InputView inputView = new InputView();

    @Test
    @DisplayName("입력한 값 중복 테스트")
    void inputNumberConvertArrayTest() {
       int[] arrayNumber = {1 , 1 , 3};
       int count = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[i] == arrayNumber[j]) {
                    count++;
                }
            }
        }
        Assertions.assertEquals(1, count);
    }
}