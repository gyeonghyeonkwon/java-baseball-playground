package baseball.inputview;

import javax.xml.transform.Source;
import java.util.Scanner;

public class InputView {

    private Scanner sc;
    private int inputValue ;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public int[] getArrayInputValue() {
        System.out.print("숫자를 입력해주세요: ");
        this.inputValue = sc.nextInt();
        int[] inputArrayValue = arrayInputValue();
        /**
         *  숫자가 3개가 될 때 까지 반복 순회
         *  숫자가 1개 인 경우  숫자가 1 이나 2 면 반환
         */
        while (inputArrayValue.length != 3) {
            if (inputArrayValue.length == 1 && inputArrayValue[0] == 1 || inputArrayValue[0] == 2) {
                return inputArrayValue;
            }
            System.out.print("세자리 정수를 입력해주세요: ");
            this.inputValue = sc.nextInt();
            inputArrayValue = arrayInputValue(); //  arrayInputValue() 결과 값을 inputArrayValue 담아 반복문 실행 여부 판단
        }
        return inputArrayValue;
    }

    private int[] arrayInputValue() {
        String[] arrayStr = intConvertArray();
        int[] arrayValue = new int[arrayStr.length];
        if (arrayValue.length == 3 || arrayValue.length == 1) {
            for (int i = 0; i < arrayValue.length; i++) {
                arrayValue[i] = Integer.parseInt(arrayStr[i]);
            }
            return arrayValue;
        }
        return arrayValue;
    }

    private String[] intConvertArray() {
        return String.valueOf(this.inputValue).split("");
    }
}
