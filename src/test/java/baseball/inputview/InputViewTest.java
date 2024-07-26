package baseball.inputview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    @Test
    void inputTest() {

        InputView inputView = new InputView();
        System.out.print("정수입력: ");
        int num = inputView.getInputValue();

        Assertions.assertEquals(5 , num);
    }

    @Test
    void inputNumberConvertArrayTest() {

        InputView inputView = new InputView();

        int num = 0;

        int [] testNumber = inputView.getArrayInputValue();

        System.out.println(Arrays.toString(testNumber));

    }

}