package baseball.play;

import baseball.input.InputSc;
import baseball.user.User;

import java.util.List;

public class PlayGame {

    public void start() {
        User user = new User();
        while (true) {
            List<Integer> userNumber = user.getThreeDigitNumbers(InputSc.sc());
            System.out.println(userNumber);
        }
    }
}
