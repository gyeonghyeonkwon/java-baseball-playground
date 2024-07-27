package baseball;

import baseball.baseball.Baseball;
import baseball.inputview.InputView;
import baseball.randomNumber.RandomNumber;

import java.util.Arrays;

public class BaseBallApp {
    public void run() {
        InputView inputView = new InputView();
        RandomNumber randomNumber = new RandomNumber();
        Baseball baseball = new Baseball();

        while (true) {
            int[] test = inputView.getArrayInputValue();

            if (test.length == 1 && test[0] == 1) {
                System.out.println("게임을 다시 시작합니다.");
                continue;
            }
            if (test.length == 1 && test[0] == 2) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

        }
    }
}

