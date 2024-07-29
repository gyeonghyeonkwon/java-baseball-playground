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
            int[] arrayInputValue =  inputView.getArrayInputValue();
            Integer[] randomValue = {1 , 2 , 3};

            System.out.println("컴퓨터 랜덤 숫자: " + Arrays.toString(randomValue));

            if (arrayInputValue.length == 1 && arrayInputValue[0] == 1) {
                System.out.println("게임을 새로 시작합니다.");
                continue;
            }
            if (arrayInputValue.length == 1 && arrayInputValue[0] == 2) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            int num = baseball.baseballResult(arrayInputValue , randomValue);
            if (baseball.getStrike() == 3){
                if (num == 1) {
                    System.out.println("게임 새로시작 ");
                    continue;
                }
                if (num == 2) {
                    System.out.println("게임 종료");
                    return;
                }
            }
        }
    }
}

