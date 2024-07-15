package baseball.baseball;

import baseball.BaseBallApp;
import baseball.randomNumber.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BaseballTest {

    @Test
    @DisplayName("index 테스트")
    void strikeAndBallCountTest() {
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

}