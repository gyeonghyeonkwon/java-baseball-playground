package baseball.baseball;

import baseball.inputview.InputView;
import baseball.randomNumber.RandomNumber;

import java.util.Scanner;

public class Baseball extends InputView{
    private int strike;
    private int ball;
    private String foul;

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }
    public String getFoul() {
        return foul;
    }

    public int baseballResult (int[] inputArrayValue , Integer[] randomArrayValue) {
        int sc = 0;
        strike = 0;
        ball = 0;
        foul = "";
        for (int i = 0; i < inputArrayValue.length; i++) {
            for (int j = 0; j < randomArrayValue.length; j++) {
                if (inputArrayValue[i] == randomArrayValue[j] && i == j) {
                    strike ++;
                }
                if (inputArrayValue[i] == randomArrayValue[j] && i != j){
                    ball ++;
                }
            }
        }

        if (strike > 0) {
            System.out.println(strike + "스트라이크 ");
        }
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            sc = super.getScanner();
            return sc;
        }
        if (ball > 0) {
            System.out.println(ball + "볼");
        }
        if (strike == 0 && ball == 0) {
            foul = "낫싱";
            System.out.println(foul);
        }
        return sc;
    }
}
