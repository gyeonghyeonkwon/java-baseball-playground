package baseball.baseball;

import baseball.BaseBallApp;
import baseball.inputview.InputView;
import baseball.randomNumber.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BaseballTest {

    @Test
    @DisplayName("strike 테스트")
    void strikeCountTest() {
        int strike = 0;
        int ball = 0;
        Integer[] randomArray = {4 , 2 , 5};
        int[] inputArray = {4 , 2 , 5};

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (randomArray[i] == inputArray[j] && i == j) {
                    strike ++;
                }
                if (randomArray[i] == inputArray[j] && i != j){
                    ball++;
                }
            }
        }
        assertThat(3).isEqualTo(strike);
        System.out.println("strike = " + strike);
        System.out.println("ball = " + ball);
    }

    @Test
    @DisplayName("ball 테스트")
    void ballCountTest() {
        int strike = 0;
        int ball = 0;
        Integer[] randomArray = {1 , 2 , 5};
        int[] inputArray = {5 , 1 , 2};

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (randomArray[i] == inputArray[j] && i == j) {
                    strike ++;
                }
                if (randomArray[i] == inputArray[j] && i != j){
                    ball++;
                }
            }
        }
        assertThat(3).isEqualTo(ball);
        System.out.println("ball = " + ball);
    }
    @Test
    @DisplayName("strike and ball 테스트")
    void strikeAndBallCountTest() {
        int strike = 0;
        int ball = 0;
        Integer[] randomArray = {4 , 2 , 5};
        int[] inputArray = {5 , 2 , 1};

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (randomArray[i] == inputArray[j] && i == j) {
                    strike ++;
                }
                if (randomArray[i] == inputArray[j] && i != j){
                    ball++;
                }
            }
        }
        assertThat(1).isEqualTo(strike);
        assertThat(1).isEqualTo(ball);
    }
    @Test
    void classT1() {
        int strike = 0;
        int ball = 0;

        Baseball baseball = new Baseball();
        InputView inputView = new InputView();
        RandomNumber randomNumber = new RandomNumber();

    }
}