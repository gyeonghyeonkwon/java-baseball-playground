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
    @DisplayName("스트라이크 테스트")
    void classT1() {
        Baseball baseball = new Baseball();

        int[] inputValue = {1 , 2 , 3};

        Integer[] randomValue = {1 , 2 , 3};

        baseball.baseballResult(inputValue , randomValue);

        int strike = baseball.getStrike();

        assertThat(3).isEqualTo(strike);
    }
    @Test
    @DisplayName("볼 테스트")
    void classT2() {
        Baseball baseball = new Baseball();
        int[] inputValue = {3 , 1 , 2};

        Integer[] randomValue = {1 , 2 , 3};

        baseball.baseballResult(inputValue , randomValue);

        int ball = baseball.getBall();

        assertThat(3).isEqualTo(ball);
    }

    @Test
    @DisplayName("낫싱 테스트")
    void classT3() {
        Baseball baseball = new Baseball();
        int[] inputValue = {4 , 5 , 6};
        Integer[] randomValue = {1 , 2 , 3};

        baseball.baseballResult(inputValue , randomValue);

        String foul = baseball.getFoul();

        assertThat("낫싱").isEqualTo(foul);
    }

    @Test
    @DisplayName("스트라이크 와 볼 테스트")
    void classT4() {
        Baseball baseball = new Baseball();
        int[] inputValue = {1 , 3 , 6};
        Integer[] randomValue = {1 , 2 , 3};

        baseball.baseballResult(inputValue , randomValue);

        int strike = baseball.getStrike();
        int ball = baseball.getBall();

        assertThat(1).isEqualTo(strike);
        assertThat(1).isEqualTo(ball);
    }


}