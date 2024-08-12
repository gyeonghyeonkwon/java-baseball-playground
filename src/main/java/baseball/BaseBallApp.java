package baseball;

import baseball.baseball.Baseball;
import baseball.inputview.InputView;
import baseball.randomNumber.RandomNumber;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class BaseBallApp {
    public void run() {
        RandomNumber randomNumber = new RandomNumber();
        Baseball baseball = new Baseball();
        while (true) {
               int[] arrayInputValue =  baseball.getArrayInputValue();
               Integer[] randomValue = randomNumber.getArrayNumber();

               System.out.println("컴퓨터 랜덤 숫자: " + Arrays.toString(randomValue));

               int sc = baseball.baseballResult(arrayInputValue , randomValue);

               if (baseball.getStrike() == 3){
                   if (sc == 1) {
                       System.out.println("게임을 새로 시작 합니다. ");
                       randomNumber = new RandomNumber();
                       continue;
                   }
                   if (sc == 2) {
                       System.out.println("게임을 종료 합니다.");
                       return;
                   }
               }

        }
    }
}

