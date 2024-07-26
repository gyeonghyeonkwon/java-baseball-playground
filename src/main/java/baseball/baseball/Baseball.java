package baseball.baseball;

import baseball.inputview.InputView;
import baseball.randomNumber.RandomNumber;

public class Baseball {
    private int strike;
    private int ball;
    private String foul;

    public int getStrike () {
        return strike;
    }
    public int getBall () {
        return  ball;
    }

    private void baseballResult (InputView input , RandomNumber random) {
        int[] inputArray = input.getArrayInputValue();
        Integer[] randomArray = random.getArrayNumber();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < randomArray.length; j++) {
                if (randomArray[i] == inputArray[j] && i == j) {
                    strike ++;
                }
                if (randomArray[i] == inputArray[j] && i != j){
                    ball++;
                }
            }
        }
    }
}
